package com.example.foodrate.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    private val _state = MutableLiveData<HomeState>(HomeState.Idle)
    val state: LiveData<HomeState> = _state

    fun onLoginButtonClicked() {
        _state.value = HomeState.NavegateToLogin
    }

    fun onRegisterClicked(){
        _state.value = HomeState.NavegateToRegister
    }

    fun loadData() {
        _state.value = HomeState.loading

        try{
            Thread.sleep(1000)
            _state.value = HomeState.Idle
        }catch (e: Exception){
            _state.value = HomeState.Erro(e.message.toString())
        }

    }
}