package com.joel.comics.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun RetrySection(
    error: String,
    onRetry: () -> Unit
){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = " Invalid",
            color = Color.Red,
            textAlign = TextAlign.Center
        )
        Button(
            onClick = { onRetry() },
            modifier = Modifier
                .align(CenterHorizontally)
        ) {
            Text(
                text = "Retry",
                textAlign = TextAlign.Center
            )
        }
    }
}

//@Preview
//@Composable
//fun RetryPreview(){
//    RetrySection()
//}