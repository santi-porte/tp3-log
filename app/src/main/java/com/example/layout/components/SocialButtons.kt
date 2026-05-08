package com.example.layout.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.layout.R

@Composable
fun SocialButtons(
    onGoogleClick: () -> Unit,
    onFacebookClick: () -> Unit,
    onAppleClick: () -> Unit
) {
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Botón Google
        SocialButton(
            drawableId = R.drawable.ic_google,
            contentDescription = "Google",
            onClick = onGoogleClick
        )

        Spacer(modifier = Modifier.width(8.dp))

        // Botón Facebook
        SocialButton(
            drawableId = R.drawable.ic_facebook,
            contentDescription = "Facebook",
            onClick = onFacebookClick
        )

        Spacer(modifier = Modifier.width(8.dp))

        // Botón Apple
        SocialButton(
            drawableId = R.drawable.ic_apple,
            contentDescription = "Apple",
            onClick = onAppleClick
        )
    }
}

@Composable
fun SocialButton(
    drawableId: Int,
    contentDescription: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(60.dp, 44.dp)
            .background(Color(0xFFECECEC), RoundedCornerShape(10.dp))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(drawableId),
            contentDescription = contentDescription,
            modifier = Modifier.size(100.dp)
        )
    }
}