package com.example.foodrate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodrate.ui.navigation.Navigation
import com.example.foodrate.ui.screen.HomeScreen
import com.example.foodrate.ui.screen.LoginScreen
import foodrate.ui.theme.FoodRateTheme

class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodRateTheme{
                val navController = rememberNavController()
                    HomeScreen(
                        onLoginClick = { navController.navigate(Navigation.Login.route) },
                        onRegisterClick = { navController.navigate(Navigation.Register.route) }
                    )
                }
            }
        }
    }
