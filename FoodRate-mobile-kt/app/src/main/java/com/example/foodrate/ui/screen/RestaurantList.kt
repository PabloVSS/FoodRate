package com.example.foodrate.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@Composable
fun RestaurantList(){
    Column {
        Text("RestaurantList")
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantListPreview() {
    RestaurantList()
}
