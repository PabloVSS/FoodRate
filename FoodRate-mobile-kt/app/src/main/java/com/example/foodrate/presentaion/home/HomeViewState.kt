package com.example.foodrate.presentaion.home

sealed class HomeViewState{
    object Idle: HomeViewState()
    object NavigateToRegister: HomeViewState()
    object NavigationToLogin : HomeViewState() {

    }

    data class Error(val message: String) : HomeViewState()

}
