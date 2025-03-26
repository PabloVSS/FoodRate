// app/src/main/java/com/example/foodrate/presentation/home/HomeActivity.kt
package com.example.foodrate.presentation.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import foodrate.ui.theme.FoodRateTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.foodrate.presentation.login.LoginScreen
import com.example.foodrate.presentation.register.RegisterScreen
import foodrate.navigation.Navigation

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodRateTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Navigation.Home.route
                ) {
                    composable(Navigation.Home.route) {
                        HomeScreen(
                            onLoginClick = { navController.navigate(Navigation.Login.route) },
                            onRegisterClick = { navController.navigate(Navigation.Register.route) }
                        )
                    }
                    composable(Navigation.Login.route) {
                        LoginScreen(onBack = { navController.popBackStack() })
                    }
                    composable(Navigation.Register.route) {
                        RegisterScreen(onBack = { navController.popBackStack() })
                    }
                }
            }
        }
    }
}

