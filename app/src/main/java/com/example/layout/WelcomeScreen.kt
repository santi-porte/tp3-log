package com.example.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.layout.ui.theme.poppinFonts
import com.example.layout.ui.theme.PrimaryBlue
import com.example.layout.ui.theme.TextBlack
import com.example.layout.ui.theme.TextWhite
import com.example.layout.ui.theme.ShadowBlue

@Composable
fun WelcomeScreen(
    onLoginClick: () -> Unit = {},      // ← Callback cuando se toca Login
    onRegisterClick: () -> Unit = {}    // ← Callback cuando se toca Register
) {
    Column(
        modifier = Modifier
            .fillMaxSize()                      // Ocupa toda la pantalla
            .verticalScroll(rememberScrollState()) // Scrolleable si necesita
            .background(Color.White),           // Fondo blanco
        horizontalAlignment = Alignment.CenterHorizontally  // Centrado horizontalmente
    ) {
        // ============ IMAGEN ============
        // La imagen: 385px width, 422px height, radius 20px
        Box(
            modifier = Modifier
                .width(385.dp)                  // Ancho fijo
                .height(422.dp)                 // Alto fijo
                .padding(
                    top = 16.dp,                // Espacio desde arriba
                    start = 22.dp,              // Espacio desde izquierda
                    end = 11.dp                 // Espacio desde derecha
                )
                .clip(RoundedCornerShape(20.dp))  // ← Radio 20px
                .background(Color.LightGray)    // Placeholder mientras cargas imagen
        ) {
            Image(
                painter = painterResource(id = R.drawable.welcome_image),
                contentDescription = "Welcome Image",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = 32.dp,
                        start = 11.dp,
                        end = 11.dp,
                        bottom = 32.dp
                    ),
                contentScale = ContentScale.Crop
            )
        }

        // ============ ESPACIADOR ============
        Spacer(modifier = Modifier.height(74.dp))  // Gap entre imagen y título

        // ============ TÍTULO "Discover Your Dream Job here" ============
        Text(
            text = "Discover Your\nDream Job here",
            modifier = Modifier
                .width(343.dp)                  // Ancho del texto
                .padding(top = 496.dp - 422.dp - 16.dp)  // Posición absoluta convertida a relativa
                .align(Alignment.CenterHorizontally),
            fontSize = 35.sp,                   // 35px
            fontWeight = FontWeight.SemiBold,   // 600 = SemiBold
            fontFamily = poppinFonts,
            color = PrimaryBlue,                // Azul #1F41BB
            textAlign = TextAlign.Center        // Centrado
        )

        // ============ ESPACIADOR ============
        Spacer(modifier = Modifier.height(40.dp))

        // ============ SUBTÍTULO "Explore all..." ============
        Text(
            text = "Explore all the existing job roles based on your interest and study major",
            modifier = Modifier
                .width(323.dp)
                .align(Alignment.CenterHorizontally),
            fontSize = 14.sp,                   // 14px
            fontWeight = FontWeight.Normal,     // 400 = Regular
            fontFamily = poppinFonts,
            color = TextBlack,                  // Negro #0A0A0A
            textAlign = TextAlign.Center
        )

        // ============ ESPACIADOR ============
        Spacer(modifier = Modifier.height(113.dp))  // Gap hacia botones

        // ============ ROW DE BOTONES ============
        Row(
            modifier = Modifier
                .width(350.dp)                  // Ancho total
                .height(60.dp)
                .padding(start = 39.dp, end = 39.dp),  // Left 39px, Right 39px
            horizontalArrangement = Arrangement.spacedBy(30.dp)  // Gap 30px entre botones
        ) {
            // -------- BOTÓN LOGIN --------
            Button(
                onClick = onLoginClick,         // Navega a Login Screen
                modifier = Modifier
                    .width(160.dp)              // Ancho fijo
                    .height(60.dp)              // Alto
                    .clip(RoundedCornerShape(10.dp))  // Radio 10px
                    .shadow(
                        elevation = 20.dp,      // Blur 20px
                        shape = RoundedCornerShape(10.dp),
                        ambientColor = ShadowBlue
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryBlue // Fondo azul
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Login",
                    fontSize = 20.sp,           // 20px
                    fontWeight = FontWeight.SemiBold,  // 600
                    fontFamily = poppinFonts,
                    color = TextWhite           // Texto blanco
                )
            }

            // -------- BOTÓN REGISTER --------
            OutlinedButton(
                onClick = onRegisterClick,      // Navega a Register Screen
                modifier = Modifier
                    .width(160.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(10.dp)),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,  // Fondo blanco
                    contentColor = TextBlack        // Texto negro
                ),
                border = BorderStroke(1.dp, TextBlack)  // Border negro 1px
            ) {
                Text(
                    text = "Register",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = poppinFonts,
                    color = TextBlack            // Texto negro
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))  // Space al final
    }
}
