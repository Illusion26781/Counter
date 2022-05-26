package com.example.counter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Counter(counter:Int, incCounter: () -> Int, resetCounter: () -> Unit) {

    Column()
    {
        Text(counter.toString())

        Row()
        {
            Button(onClick = {
                incCounter()
            })
            {
                Text("Inc")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = { resetCounter() },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red))
            {
                Text("Reset")
            }
        }
    }
}