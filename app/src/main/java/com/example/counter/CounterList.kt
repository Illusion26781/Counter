package com.example.counter

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterList()
{
    var counterTotal by remember{ mutableStateOf(0) }
    val counters = remember { mutableStateListOf<Int>() }

    LazyColumn()
    {
        item{ Text(counterTotal.toString()) }

        item{
            Button(onClick = {
                counters.add(0)
            })

            {
                Text("Add Counter")
            }
        }

        items(counters.size){
            Row{
                Counter(counters[it],
                {
                    counterTotal++
                    counters[it]++
                }
                ) {
                    counterTotal -= counters[it]
                    counters[it] = 0
                }

                Spacer(modifier = Modifier.width(8.dp))

                Button(onClick = {
                    counterTotal -= counters[it]
                    counters.removeAt(it)
                })
                {
                    Text("Remove Counter")
                }
            }
        }

    }
}