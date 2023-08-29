package com.example.aulasabado.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen() {
    Column {

        Text(
            text = "Gabriel Freire!"
        )

        Text(text = "TextoDaMainScreen")

            Button(onClick = { Log.i("###Mainscreen(){","Botão1 Clicado!")}) {
                Text("Button1")
            }
            Button(onClick = { Log.i("###Mainscreen(){","Botão2 Clicado!")}) {
                Text("Navegar para TaksScreen")
        }
    }
}