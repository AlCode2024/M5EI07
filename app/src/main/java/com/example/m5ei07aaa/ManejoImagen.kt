package com.example.m5ei07aaa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BotonImagen() {
    var ImagenVisible by remember { mutableStateOf(false) }
    var boton01 by remember { mutableStateOf("Mostrar Imágenes") }

    Button(onClick = {
        ImagenVisible = !ImagenVisible
        boton01 = if (ImagenVisible) "Ocultdsar Imágefdnes" else "Mostrar Imágenes"
    }) {
        Text(text = boton01)
    }

    Spacer(modifier = Modifier.height(16.dp))

    if (ImagenVisible) {
        // Lista de recursos de imágenes
        val imagenes = listOf(
            R.drawable.a01,
            R.drawable.a02,
            R.drawable.a03,
            R.drawable.a04,
            R.drawable.a05
        )

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp) // Espacio entre las imágenes
        ) {
            items(imagenes) { imagenRes ->
                Image(
                    painter = painterResource(id = imagenRes),
                    contentDescription = "Imagen de la app",
                    modifier = Modifier.size(200.dp)
                )
            }

        }
        LazyColumn(
            modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center
        ) {
            items(imagenes) { imagenRes ->
                Image(
                    painter = painterResource(id = imagenRes),
                    contentDescription = "Imagen de la app",
                    modifier = Modifier.size(200.dp)
                )
            }
    }
}
}
