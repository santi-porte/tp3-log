package com.example.layout.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.layout.ui.theme.poppinFonts

@Composable
fun TextLink(
    text: String,
    color: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier.clickable { onClick() },
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = poppinFonts,
        color = color,
        textAlign = TextAlign.Center,
        lineHeight = 21.sp,
        maxLines = 1
    )
}