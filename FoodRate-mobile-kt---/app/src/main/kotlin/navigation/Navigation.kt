package foodrate.navigation

sealed class Navigation(val route: String) {
    object Home: Navigation("home")
    object Login: Navigation("login")
    object Register: Navigation("register")
}