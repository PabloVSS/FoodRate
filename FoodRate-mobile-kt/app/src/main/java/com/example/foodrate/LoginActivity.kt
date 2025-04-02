package com.example.foodrate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.foodrate.ui.screen.LoginScreen
import androidx.navigation.compose.rememberNavController
import com.example.foodrate.ui.navigation.Navigation
import foodrate.ui.theme.FoodRateTheme

class LoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodRateTheme{
                val navController = rememberNavController()
                LoginScreen(
                    navController = TODO()
                )
            }
        }
    }
}