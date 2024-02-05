package com.example.trial2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        AppBar(name = "ag")
    }
}