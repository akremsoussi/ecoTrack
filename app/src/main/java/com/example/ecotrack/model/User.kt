package com.example.ecotrack.model

import com.google.firebase.auth.FirebaseUser

data class User(
    val uid: String,
    val displayName: String,
    val email: String,
    val passwordHash : String,
)

