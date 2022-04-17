package com.yvkalume.animatedcard

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Header() {
    Column {
        Text(text = "Your Library", style = MaterialTheme.typography.h5)
        Text(text = "Listen to your favorite music today",  style = MaterialTheme.typography.subtitle1)
    }
}