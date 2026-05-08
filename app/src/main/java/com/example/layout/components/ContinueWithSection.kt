package com.example.layout.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.stringResource
import com.example.layout.R
import com.example.layout.ui.theme.PrimaryBlue
import com.example.layout.ui.theme.poppinFonts

@Composable
fun ContinueWithSection(
    onGoogleClick: () -> Unit,
    onFacebookClick: () -> Unit,
    onAppleClick: () -> Unit
) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Texto "Or continue with"
        Text(
            text = stringResource(R.string.continue_with),
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = poppinFonts,
            color = PrimaryBlue,
            textAlign = TextAlign.Center,
            lineHeight = 14.sp
        )

        // Botones sociales
        SocialButtons(
            onGoogleClick = onGoogleClick,
            onFacebookClick = onFacebookClick,
            onAppleClick = onAppleClick
        )
    }
}