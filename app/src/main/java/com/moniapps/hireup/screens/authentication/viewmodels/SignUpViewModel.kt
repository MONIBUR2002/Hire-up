package com.moniapps.hireup.screens.authentication.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SignUpViewModel : ViewModel() {

    private val _email = MutableStateFlow("")
    var emailText : StateFlow<String> = _email.asStateFlow()
    private val _password = MutableStateFlow("")
    var passwordText : StateFlow<String> = _password.asStateFlow()
    private val _confirmPassword = MutableStateFlow("")
    var confirmPasswordText : StateFlow<String> = _confirmPassword.asStateFlow()
    private val _checked = MutableStateFlow(false)
    var checked : StateFlow<Boolean> = _checked.asStateFlow()
    private val _showPassword = MutableStateFlow(false)
    var showPassword : StateFlow<Boolean> = _showPassword.asStateFlow()


    fun email(email: String) {
        _email.value = email
    }
    fun password(password: String) {
        _password.value = password
    }
    fun confirmPassword(confirmPassword: String) {
        _confirmPassword.value = confirmPassword
    }
    fun checked(checked: Boolean) {
        _checked.value = checked
    }
    fun showPassword(showPassword: Boolean) {
        _showPassword.value = !showPassword
    }
}