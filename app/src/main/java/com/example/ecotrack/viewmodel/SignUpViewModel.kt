package com.example.ecotrack.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecotrack.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SignUpViewModel : ViewModel(){
    private val auth = FirebaseAuth.getInstance()
    private val firestore = FirebaseFirestore.getInstance()

    private val _username = MutableStateFlow("")
    val username : StateFlow<String> = _username.asStateFlow()

    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email.asStateFlow()

    private val _password = MutableStateFlow("")
    val password: StateFlow<String> = _password.asStateFlow()

    private val _campus = MutableStateFlow("")
    val campus: StateFlow<String> = _campus.asStateFlow()

    private val _signUpResult = MutableStateFlow<Result<String>?>(null)
    val signUpResult: StateFlow<Result<String>?> = _signUpResult

    fun onUsernameChange(username: String) {
        _username.value = username

    }
    fun onEmailChange(email: String) {
        _email.value = email
    }
    fun onPasswordChange(password: String) {
        _password.value = password
    }
    fun onCampusChange(campus: String) {
        _campus.value = campus
    }

    fun signUp() {
        if(_username.value.isEmpty() || _email.value.isEmpty() || _password.value.isEmpty() || _campus.value.isEmpty()){
            _signUpResult.value = Result.failure(Exception("Please fill all the fields"))
            return
        }

        viewModelScope.launch {
            auth.createUserWithEmailAndPassword(_email.value, _password.value)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val userId = auth.currentUser?.uid ?: return@addOnCompleteListener
                        val user = User(
                            uid = userId,
                            username = _username.value,
                            email = _email.value,
                            campus = _campus.value

                        )
                        firestore.collection("users").document(userId)
                            .set(user)
                            .addOnSuccessListener {
                                _signUpResult.value = Result.success("Sign up successful")
                            }
                            .addOnFailureListener { e ->
                                _signUpResult.value = Result.failure(e)
                            }
                    }   else{
                        _signUpResult.value = Result.failure(task.exception ?: Exception("Sign up failed"))
                    }
                }

        }
    }
}