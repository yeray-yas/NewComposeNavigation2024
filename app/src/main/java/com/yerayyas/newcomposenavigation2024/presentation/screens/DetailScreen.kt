package com.yerayyas.newcomposenavigation2024.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.yerayyas.newcomposenavigation2024.presentation.navigation.SettingsInfo


@Composable
fun DetailScreen(
    name: String,
    navigateToSettings: (SettingsInfo) -> Unit,
    navigateBack: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "DETAIL SCREEN $name", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {
            val settingsInfo = SettingsInfo(
                name = "Yeray",
                age = 25,
                isAdult = true,
                darkMode = false
            )
            navigateToSettings(settingsInfo)
        }) {
            Text(text = "Navigate to settings screen")
        }
        Button(onClick = { navigateBack() }) {
            Text(text = "Log out")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}