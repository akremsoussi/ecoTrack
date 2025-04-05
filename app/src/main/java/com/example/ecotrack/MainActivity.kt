package com.example.ecotrack


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.ecotrack.view.CarbonFootprintScreen
import com.example.ecotrack.view.EcoTrackLoginScreen
import com.example.ecotrack.view.SignUpScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SignUpScreen()
        }
    }
}

