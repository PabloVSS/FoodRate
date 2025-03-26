package foodrate.presentaion.registrate.view.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.foodrate.presentation.register.RegisterScreen
import foodrate.ui.theme.FoodRateTheme

class RegistrateActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            FoodRateTheme {
                RegisterScreen(
                    onBack = TODO()

                )    
            }
        }
    }
}