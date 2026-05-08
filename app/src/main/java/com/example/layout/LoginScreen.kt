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
        // ============ TÍTULO "Login here" ============
        Spacer(modifier = Modifier.height(97.dp))

        Text(
            text = stringResource(R.string.login_title),
            modifier = Modifier
                .width(160.dp)
                .height(45.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = poppinFonts,
            color = PrimaryBlue,
            textAlign = TextAlign.Center
        )

        // ============ SUBTÍTULO ============
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.login_subtitle),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = poppinFonts,
            color = TextBlack,
            textAlign = TextAlign.Center
        )

        // ============ EMAIL INPUT ============
        LoginTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Email",
            showBorder = true,
            modifier = Modifier
                .width(357.dp)
                .padding(horizontal = 20.dp)
        )

// ============ PASSWORD INPUT ============
        Spacer(modifier = Modifier.height(24.dp))

        LoginTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = "Password",
            isPassword = true,
            showBorder = false,
            modifier = Modifier
                .width(357.dp)
                .padding(horizontal = 20.dp)
        )

        // ============ "FORGOT YOUR PASSWORD?" ============
        Spacer(modifier = Modifier.height(20.dp))

        TextLink(
            text = stringResource(R.string.login_forgot_password),
            color = PrimaryBlue,
            onClick = onForgotPasswordClick,
            modifier = Modifier.fillMaxWidth()
        )

        // ============ BOTÓN "SIGN IN" ============
        Spacer(modifier = Modifier.height(32.dp))

        AuthButton(
            text = stringResource(R.string.btn_sign_in),
            onClick = onSignInClick
        )

        // ============ "CREATE NEW ACCOUNT" ============
        Spacer(modifier = Modifier.height(24.dp))

        TextLink(
            text = stringResource(R.string.create_account),
            color = TextGray,
            onClick = onCreateAccountClick
        )

        // ============ "OR CONTINUE WITH" + BOTONES SOCIALES ============
        Spacer(modifier = Modifier.height(50.dp))

        ContinueWithSection(
            onGoogleClick = onGoogleClick,
            onFacebookClick = onFacebookClick,
            onAppleClick = onAppleClick
        )

        Spacer(modifier = Modifier.height(50.dp))
    }
}