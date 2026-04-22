package com.example.layout

import com.example.layout.components.LoginTextField
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.layout.ui.theme.*

// ============ PANTALLA: LoginScreen ============
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
            text = "Login here",
            modifier = Modifier
                .width(160.dp)
                .height(45.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,  // 700 = Bold
            fontFamily = poppinFonts,
            color = PrimaryBlue,
            textAlign = TextAlign.Center
        )

        // ============ SUBTÍTULO ============
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Welcome back you've\nbeen missed!",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = poppinFonts,
            color = TextBlack,
            textAlign = TextAlign.Center
        )

        // ============ EMAIL INPUT ============
        Spacer(modifier = Modifier.height(40.dp))

        LoginTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Email",
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
            modifier = Modifier
                .width(357.dp)
                .padding(horizontal = 20.dp)
        )

        // ============ "FORGOT YOUR PASSWORD?" ============
        Spacer(modifier = Modifier.height(20.dp))

        TextButton(
            onClick = onForgotPasswordClick,
            modifier = Modifier
                .width(163.dp)
                .height(21.dp)
        ) {
            Text(
                text = "Forgot your password?",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = poppinFonts,
                color = PrimaryBlue,
                textAlign = TextAlign.Center
            )
        }

        // ============ BOTÓN "SIGN IN" ============
        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onSignInClick,
            modifier = Modifier
                .width(357.dp)
                .height(60.dp)
                .clip(RoundedCornerShape(10.dp))
                .shadow(
                    elevation = 20.dp,
                    shape = RoundedCornerShape(10.dp),
                    ambientColor = ShadowBlue
                ),
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryBlue
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Sign in",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = poppinFonts,
                color = TextWhite
            )
        }

        // ============ "CREATE NEW ACCOUNT" ============
        Spacer(modifier = Modifier.height(24.dp))

        TextButton(
            onClick = onCreateAccountClick,
            modifier = Modifier
                .width(145.dp)
                .height(21.dp)
        ) {
            Text(
                text = "Create new account",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = poppinFonts,
                color = TextGray,
                textAlign = TextAlign.Center
            )
        }

        // ============ "OR CONTINUE WITH" ============
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Or continue with",
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = poppinFonts,
            color = PrimaryBlue,
            textAlign = TextAlign.Center
        )

        // ============ BOTONES SOCIALES ============
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .width(200.dp)
                .height(44.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Botón Google
            Button(
                onClick = onGoogleClick,
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(10.dp)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFECECEC)
                )
            ) {
                Text(
                    text = "G",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextBlack
                )
            }

            // Botón Facebook
            Button(
                onClick = onFacebookClick,
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(10.dp)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFECECEC)
                )
            ) {
                Text(
                    text = "f",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextBlack
                )
            }

            // Botón Apple
            Button(
                onClick = onAppleClick,
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(10.dp)),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFECECEC)
                )
            ) {
                Text(
                    text = "🍎",
                    fontSize = 20.sp,
                    color = TextBlack
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))
    }
}
