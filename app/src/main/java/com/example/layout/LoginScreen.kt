package com.example.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout.components.AuthButton
import com.example.layout.components.ContinueWithSection
import com.example.layout.components.LoginTextField
import com.example.layout.components.ScreenTitle
import com.example.layout.components.TextLink
import com.example.layout.ui.theme.*

@Composable
fun LoginScreen(
    onSignInClick: () -> Unit = {},
    onForgotPasswordClick: () -> Unit = {},
    onCreateAccountClick: () -> Unit = {},
    onGoogleClick: () -> Unit = {},
    onFacebookClick: () -> Unit = {},
    onAppleClick: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // ============ TÍTULO + SUBTÍTULO ============
        Spacer(modifier = Modifier.height(97.dp))

        // Título "Login here"
        ScreenTitle(
            title = stringResource(R.string.login_title),
            subtitle = stringResource(R.string.login_subtitle)
        )

        Spacer(modifier = Modifier.height(60.dp))

        // ============ EMAIL + PASSWORD BOX ============
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(25.dp)
        ) {
            // Email Input
            LoginTextField(
                value = email,
                onValueChange = { email = it },
                placeholder = "Email",
                showBorder = true,
                modifier = Modifier
                    .width(357.dp)
                    .height(64.dp)
            )

            // Password Input
            LoginTextField(
                value = password,
                onValueChange = { password = it },
                placeholder = "Password",
                isPassword = true,
                showBorder = false,
                modifier = Modifier
                    .width(357.dp)
                    .height(64.dp)
            )
        }

        // ============ "FORGOT YOUR PASSWORD?" ============
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextLink(
                text = stringResource(R.string.login_forgot_password),
                color = PrimaryBlue,
                onClick = onForgotPasswordClick
            )
        }

        // ============ BOTÓN "SIGN IN" ============
        Spacer(modifier = Modifier.height(32.dp))

        AuthButton(
            text = stringResource(R.string.btn_sign_in),
            onClick = onSignInClick
        )

        // ============ "CREATE NEW ACCOUNT" ============
        Spacer(modifier = Modifier.height(30.dp))

        TextLink(
            text = stringResource(R.string.create_account),
            color = TextGray,
            onClick = onCreateAccountClick
        )

        // ============ "OR CONTINUE WITH" + BOTONES SOCIALES ============
        Spacer(modifier = Modifier.height(100.dp))

        ContinueWithSection(
            onGoogleClick = onGoogleClick,
            onFacebookClick = onFacebookClick,
            onAppleClick = onAppleClick
        )

        Spacer(modifier = Modifier.height(50.dp))
    }
}