package foodrate.presentaion.home.intent

sealed class HomeIntent {
    object ClickLogin: HomeIntent()
    object ClickRegister: HomeIntent()
}