package com.example.foodrate.presentaion.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch


class HomeViewModel: ViewModel() {

    private val intentChannel = Channel<HomeIntent>(Channel.UNLIMITED)
    val intent = intentChannel.consumeAsFlow()

    private val _state = MutableStateFlow<HomeViewState>(HomeViewState.Idle)
    val state: StateFlow<HomeViewState> = _state

    init {
        handleIntents()
    }

    fun processIntent(intent: HomeIntent) {
        viewModelScope.launch {
            intentChannel.send(intent)
        }
    }

    private fun handleIntents() {
            viewModelScope.launch {
                intent.collect { intent ->
                    when(intent) {
                        HomeIntent.ClickLogin -> handleAction(HomeAction.NavigateToLoginAction)
                        HomeIntent.ClickRegister -> handleAction(HomeAction.NavigateToRegisterAction)
                    }
                }
            }
    }

    private fun handleAction(action: HomeAction) {
        viewModelScope.launch {
            when(action) {
                HomeAction.NavigateToLoginAction -> _state.value = HomeViewState.NavigationToLogin
                HomeAction.NavigateToRegisterAction-> _state.value = HomeViewState.NavigateToRegister
            }
        }
    }

}