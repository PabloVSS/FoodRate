package com.example.foodrate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodrate.ui.navigation.Navigation
import com.example.foodrate.ui.screen.HomeScreen
import com.example.foodrate.ui.screen.LoginScreen
import com.example.foodrate.ui.screen.RegisterScreen
import foodrate.ui.theme.FoodRateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodRateTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Navigation.Home.route
                ) {
                    composable(Navigation.Home.route) {
                        HomeScreen(
                            navController = navController,
                            onLoginClick = { navController.navigate(Navigation.Login.route) },
                            onRegisterClick = { navController.navigate(Navigation.Register.route) }
                        )
                    }

                    composable(Navigation.Login.route) {
                        LoginScreen(navController = navController)
                    }


                }
            }
        }
    }
}