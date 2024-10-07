package com.example.m5ei07aaa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BotonImagen() {
    var ImagenVisible by remember { mutableStateOf(false) }
    var boton01 by remember { mutableStateOf("Mostrar Imagen") }

    Button(onClick = {
        ImagenVisible = !ImagenVisible
        boton01 = if (ImagenVisible) "Ocultar Imagen" else "Mostrar Imagen"
    }) {
        Text(text = boton01)
    }

    Spacer(modifier = Modifier.height(16.dp))

    if (ImagenVisible) {
        Image(
            painter = painterResource(id = R.drawable.a),
            contentDescription = "Imagen de la app",
            modifier = Modifier.size(200.dp)
        )
    }
}