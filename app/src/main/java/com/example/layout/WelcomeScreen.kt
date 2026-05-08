package com.example.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.res.stringResource
import com.example.layout.ui.theme.poppinFonts
import com.example.layout.ui.theme.PrimaryBlue
import com.example.layout.ui.theme.TextBlack
import com.example.layout.ui.theme.TextWhite
import com.example.layout.ui.theme.ShadowBlue

@Composable
fun WelcomeScreen(
    onLoginClick: () -> Unit = {},
    onRegisterClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // ============ IMAGEN ============
        Box(
            modifier = Modifier
                .width(385.dp)
                .height(422.dp)
                .padding(
                    top = 16.dp,
                    start = 22.dp,
                    end = 11.dp
                )
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
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
        Spacer(modifier = Modifier.height(74.dp))

        // ============ TÍTULO "Discover Your Dream Job here" ============
        Text(
            text = stringResource(R.string.welcome_title),
            modifier = Modifier
                .width(343.dp)
                .align(Alignment.CenterHorizontally),
            fontSize = 35.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = poppinFonts,
            color = PrimaryBlue,
            textAlign = TextAlign.Center,
            lineHeight = 42.sp
        )


        // ============ ESPACIADOR ============
        Spacer(modifier = Modifier.height(40.dp))

        // ============ SUBTÍTULO "Explore all..." ============
        Text(
            text = stringResource(R.string.welcome_subtitle),
            modifier = Modifier
                .width(323.dp)
                .align(Alignment.CenterHorizontally),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = poppinFonts,
            color = TextBlack,
            textAlign = TextAlign.Center
        )

        // ============ ESPACIADOR ============
        Spacer(modifier = Modifier.height(113.dp))

        // ============ ROW DE BOTONES ============
        Row(
            modifier = Modifier
                .width(350.dp)
                .height(60.dp),
            horizontalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            // -------- BOTÓN LOGIN --------
            Button(
                onClick = onLoginClick,
                modifier = Modifier
                    .width(160.dp)
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
                    text = stringResource(R.string.btn_login),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = poppinFonts,
                    color = TextWhite
                )
            }

            // -------- BOTÓN REGISTER --------
            OutlinedButton(
                onClick = onRegisterClick,
                modifier = Modifier
                    .width(160.dp)
                    .height(60.dp)
                    .clip(RoundedCornerShape(10.dp)),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,
                    contentColor = TextBlack
                ),
                border = BorderStroke(0.dp, Color.Transparent)
            ) {
                Text(
                    text = stringResource(R.string.btn_register),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = poppinFonts,
                    color = TextBlack
                )
            }
        }

        Spacer(modifier = Modifier.height(50.dp))
    }
}
