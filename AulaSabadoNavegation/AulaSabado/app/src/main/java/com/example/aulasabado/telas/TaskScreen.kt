package com.example.aulasabado.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(){

    //var vlrDOTextField = "VlrInicial"
    //recompose

    val vlrDOTextField = remember {
        mutableStateOf("VlrInicial")
    }


    Column( modifier = Modifier.padding(20.dp)) {
        Text(text = "Título  da Tarefa")
        TextField(
            value = vlrDOTextField.value,
            onValueChange = {
                //antes da tela ser redesenhada
                //roda esse trecho de codigo aqui...
                vlrDOTextField.value = it
                Log.i("### fun TaskScreen(){...", it)
            })
        Spacer(modifier = Modifier.width(20.dp))
        Text(vlrDOTextField.value)
    }
}