package com.example.ecotrack.model

import com.google.firebase.auth.FirebaseUser

data class User(
    val uid: String = "",
    val username: String = "",
    val email: String = "",
    val campus : String = ""
)

