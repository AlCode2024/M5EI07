package com.example.m5ei07aaa

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun Bienvenido() {
    Text(
        text = "¡Bienvenidos!",
        fontSize = 24.sp,
        modifier = Modifier.padding(bottom = 8.dp)
    )
}

@Composable
fun EscribeNombre(){
    Text(
        text = "Escribe Aqui Tu Nombre",
        fontSize = 20.sp
    )
}