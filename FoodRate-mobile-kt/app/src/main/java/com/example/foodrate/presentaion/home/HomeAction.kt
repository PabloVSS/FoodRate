package com.example.foodrate.presentaion.home

sealed class HomeAction {
    object NavigateToLoginAction : HomeAction()
    object NavigateToRegisterAction: HomeAction()
}