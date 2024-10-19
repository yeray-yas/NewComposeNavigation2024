package com.yerayyas.newcomposenavigation2024.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

/*@Preview(showBackground = true)*/
@Composable
fun LoginScreen(navigateToHome: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "LOGIN SCREEN", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToHome() }) {
            Text(text = "Navigate to home")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}