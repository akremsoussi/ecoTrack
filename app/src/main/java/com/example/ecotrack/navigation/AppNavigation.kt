package com.example.ecotrack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ecotrack.view.CarbonFootprintScreen
import com.example.ecotrack.view.SignUpScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "signup"
    ) {
        composable("signup") {
            SignUpScreen(
                onNavigateToLogin = { navController.navigate("login") },
                onSignUpSuccess = { navController.navigate("carbon_footprint") {
                    popUpTo("signup") { inclusive = true }
                }}
            )
        }

        composable("login") {
            // Votre LoginScreen ici (à implémenter)
        }

        composable("carbon_footprint") {
            CarbonFootprintScreen()
        }
    }
}