package com.example.layout.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import com.example.layout.ui.theme.poppinFonts
import com.example.layout.ui.theme.PrimaryBlue
import com.example.layout.ui.theme.InputBackground
import com.example.layout.ui.theme.TextBlack

@Composable
fun LoginTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    isPassword: Boolean = false,
    showBorder: Boolean = true,  // ← NUEVO parámetro
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholder,
                color = Color.Gray,
                fontSize = 14.sp,
                fontFamily = poppinFonts
            )
        },
        modifier = modifier
            .height(64.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = InputBackground,
            focusedContainerColor = InputBackground,
            unfocusedBorderColor = if (showBorder) PrimaryBlue else Color.Transparent,  // ← MODIFICADO
            focusedBorderColor = if (showBorder) PrimaryBlue else Color.Transparent     // ← MODIFICADO
        ),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        textStyle = TextStyle(
            fontSize = 14.sp,
            fontFamily = poppinFonts,
            color = TextBlack
        ),
        singleLine = true
    )
}