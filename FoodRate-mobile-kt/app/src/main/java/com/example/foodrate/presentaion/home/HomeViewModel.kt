package com.example.foodrate.presentaion.home

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow


class HomeViewModel {

    private val _state = MutableStateFlow(HomeState())
    val state: StateFlow<HomeState> = _state

    private val _navigation = Channel<NavigationEvent>()
    val navigation = _navigation.receiveAsFlow()

    fun processIntent(intent: HomeIntent){
        when(intent){
            HomeIntent.ClickLogin -> {
                val viewModelScope
                viewModelScope.launch {
                    _navigation.send(NavigationEvent.NavigateToLogin)
                }
            }
            HomeIntent.ClickRegister -> {
                    _navigation.send(NavigationEvent.NavigateToRegister)
            }
        }
    }
    class NavigationEvent {
        object NavigateToLogin: NavigationEvent()
        object NavigateToRegister: NavigationEvent()
    }

}