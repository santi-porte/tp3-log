package com.example.layout.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout.ui.theme.PrimaryBlue
import com.example.layout.ui.theme.TextBlack
import com.example.layout.ui.theme.poppinFonts

@Composable
fun ScreenTitle(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título principal
        Text(
            text = title,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = poppinFonts,
            color = PrimaryBlue,
            textAlign = TextAlign.Center,
            lineHeight = 30.sp
        )

        // Espacio entre título y subtítulo
        Spacer(modifier = Modifier.height(25.dp))

        // Subtítulo
        Text(
            text = subtitle,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = poppinFonts,
            color = TextBlack,
            textAlign = TextAlign.Center,
            lineHeight = 20.sp
        )
    }
}