// app/src/main/java/com/example/foodrate/presentation/register/RegisterScreen.kt
package com.example.foodrate.presentation.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegisterScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Tela de Registro")
        Button(onClick = onBack) {
            Text("Voltar")
        }
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(onBack = {})
}