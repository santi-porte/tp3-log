package com.example.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.layout.ui.theme.LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutTheme {
                AppNavigation()
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            WelcomeScreen(
                onLoginClick = {
                    navController.navigate("login")
                },
                onRegisterClick = {
                    navController.navigate("register")
                }
            )
        }

        composable("login") {
            LoginScreen(
                onSignInClick = {
                    navController.navigate("welcome")
                },
                onForgotPasswordClick = {
                    // TODO: Implementar pantalla de recuperar contraseña
                },
                onCreateAccountClick = {
                    navController.navigate("register")
                },
                onGoogleClick = { },
                onFacebookClick = { },
                onAppleClick = { }
            )
        }

        composable("register") {
            RegisterScreen(
                onSignUpClick = {
                    navController.navigate("welcome")
                },
                onAlreadyHaveAccountClick = {
                    navController.navigate("login")
                },
                onGoogleClick = { },
                onFacebookClick = { },
                onAppleClick = { }
            )
        }
    }
}
    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun AppNavigationPreview() {
        LayoutTheme {
            AppNavigation()
        }
    }
