package com.example.foodrate.home

sealed class HomeState {
    object Idle : HomeState()
    object loading : HomeState()
    data class Erro(val message: String) : HomeState()
    object NavegateToLogin : HomeState()
    object NavegateToRegister : HomeState()
}

