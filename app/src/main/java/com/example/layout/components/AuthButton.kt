package com.example.layout.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout.ui.theme.PrimaryBlue
import com.example.layout.ui.theme.ShadowBlue
import com.example.layout.ui.theme.TextWhite
import com.example.layout.ui.theme.poppinFonts

@Composable
fun AuthButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
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
            text = text,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = poppinFonts,
            color = TextWhite
        )
    }
}