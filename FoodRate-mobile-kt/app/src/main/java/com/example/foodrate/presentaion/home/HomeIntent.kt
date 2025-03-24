package com.example.foodrate.presentaion.home

sealed class HomeIntent {
    object ClickLogin: HomeIntent()
    object ClickRegister: HomeIntent()
}