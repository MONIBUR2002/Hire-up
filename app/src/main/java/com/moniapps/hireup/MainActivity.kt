package com.moniapps.hireup

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.windowInsets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.moniapps.hireup.screens.authentication.SignInScreen
import com.moniapps.hireup.screens.authentication.SignUpScreen
import com.moniapps.hireup.screens.authentication.viewmodels.SignInViewModel
import com.moniapps.hireup.screens.authentication.viewmodels.SignUpViewModel
import com.moniapps.hireup.ui.theme.AppTheme
import com.moniapps.hireup.ui.theme.Inter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val signInViewModel : SignInViewModel = viewModel()
            val signUpViewModel : SignUpViewModel = viewModel()
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    contentWindowInsets = WindowInsets(0,0,0,0)
                ) { innerPadding ->
                    Surface(color = AppTheme.colorScheme.background) {
                       // SignInScreen(modifier = Modifier.padding(innerPadding), viewModel = signInViewModel)
                        SignUpScreen(modifier = Modifier.padding(innerPadding), viewModel = signUpViewModel)
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun GreetingPreview() {
    AppTheme {

    }
}