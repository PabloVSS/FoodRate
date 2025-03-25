package com.example.foodrate.presentaion.home

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
        observeState()
    }

    private fun setupListeners() {
        binding.loginButton.setOncClickListener {
            viewModel.processIntent(HomeIntent.ClickLogin)
        }
        binding.registerButton.setOnClickListener{
            viewModel.processIntent(HomeIntent.ClickRegister)
        }
    }

    private fun observeState() {
        lifecycleScope.launch {
            viewModel.state.collect{ state ->
                when (state) {
                    HomeViewState.NavigationToLogin -> NavigationToLogin()
                    HomeViewState.NavigateToRegister -> NavigateToRegister()
                    is HomeViewState.Error -> showError(state.message)
                    HomeViewState.Idle -> {}
                }

            }
        }
    }



}

class NavigateToRegister : HomeViewState() {

}

class NavigationToLogin : HomeViewState() {

}

private fun showError(message: String) {

}