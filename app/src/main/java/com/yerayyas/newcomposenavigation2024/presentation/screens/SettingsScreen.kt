package com.yerayyas.newcomposenavigation2024.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.yerayyas.newcomposenavigation2024.presentation.navigation.SettingsInfo

@Composable
fun SettingsScreen(settingsInfo: SettingsInfo) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "SETTINGS SCREEN", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Text(text = settingsInfo.name)
        Text(text = settingsInfo.age.toString())
        Text(text = settingsInfo.isAdult.toString())
        Text(text = settingsInfo.darkMode.toString())
        Spacer(modifier = Modifier.weight(1f))
    }

}