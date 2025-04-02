package com.example.foodrate.ui.navigation

sealed class Navigation(val route: String) {
    object Home: Navigation("home")
    object Login: Navigation("login")
    object Register: Navigation("register")
    object RestaurantList: Navigation("restaurantList")

}