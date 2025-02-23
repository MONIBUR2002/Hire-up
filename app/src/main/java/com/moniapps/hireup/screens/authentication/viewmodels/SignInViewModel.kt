package com.moniapps.hireup.screens.authentication.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SignInViewModel : ViewModel() {
    private val _email = MutableStateFlow("")
    var emailText : StateFlow<String> = _email.asStateFlow()
    private val _password = MutableStateFlow("")
    var passwordText : StateFlow<String> = _password.asStateFlow()


    fun setEmail(email: String) {
        _email.value = email
    }

    fun setPassword(password: String) {
        _password.value = password
    }
}
