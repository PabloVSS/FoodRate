package foodrate.presentaion.home.state

import android.os.Message

sealed class HomeState {
    object Idle: HomeState()
    object loading: HomeState()
    object NavegateToLogin: HomeState()
    object NavegateToRegister: HomeState()
    data class Erro(val message: String): HomeState()
}