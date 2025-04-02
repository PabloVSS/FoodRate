// app/src/main/java/com/example/foodrate/presentation/home/HomeScreen.kt
package com.example.foodrate.presentation.home

import androidx.compose.foundation.Image
import com.example.foodrate.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import foodrate.components.MyButton
import foodrate.ui.theme.Background
import foodrate.ui.theme.Primary
import foodrate.ui.theme.Secondary
import foodrate.ui.theme.SecondaryDark

@Composable
fun HomeScreen(
    onLoginClick: () -> Unit,
    onRegisterClick: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Column(

            horizontalAlignment = Alignment.CenterHorizontally,


        )

        {
            Row {
                Text(
                    text = "FOOD",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Primary,
                    modifier = Modifier.padding(bottom = 32.dp)
                )
                Text(
                    text = "RATE",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Secondary,
                    modifier = Modifier.padding(bottom = 32.dp)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {

                MyButton(
                    text = "Login",
                    onClick = onLoginClick
                )

                Text(
                    text = buildAnnotatedString {
                        append("Ainda não tem conta?")
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = SecondaryDark
                            )
                        ) {
                            append("Cadastre aqui")
                        }
                    },
                    modifier = Modifier
                        .clickable { onRegisterClick }
                        .padding(top = 10.dp)
                )
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        onLoginClick = {},
        onRegisterClick = {}
    )
}