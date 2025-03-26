package foodrate.presentaion.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import foodrate.presentaion.home.intent.HomeIntent
import foodrate.presentaion.home.state.HomeState
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    private val intentChannel = Channel<HomeIntent>(Channel.UNLIMITED)

    private val _state = MutableStateFlow<HomeState>(HomeState.Idle)
    val state: StateFlow<HomeState> = _state

    init {
        processIntents()
    }

    fun sendIntent(intent: HomeIntent) {
        viewModelScope.launch {
            intentChannel.send(intent)
        }
    }

    private fun processIntents(){
        viewModelScope.launch {
            intentChannel.consumeAsFlow().collect { intent ->
                handleIntent(intent)
            }
        }
    }


    private fun handleIntent(intent: HomeIntent){
        when(intent){
            HomeIntent.ClickLogin -> handleLogin()
            HomeIntent.ClickRegister -> handleRegister()
        }
    }

    private fun handleLogin(){
        _state.value = HomeState.NavegateToLogin
        resetStateAfterNavigation()
    }

    private fun handleRegister(){
        _state.value = HomeState.NavegateToRegister
        resetStateAfterNavigation()
    }

    private fun resetStateAfterNavigation(){
        _state.value = HomeState.Idle
    }
}