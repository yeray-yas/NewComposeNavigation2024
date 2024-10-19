package com.yerayyas.newcomposenavigation2024.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.yerayyas.newcomposenavigation2024.presentation.viewmodel.HomeViewModel


@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel(), navigateToDetail: (String) -> Unit) {
    val userData by viewModel.userData.collectAsState()
    val text by viewModel.textFieldValue.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "HOME SCREEN", fontSize = 25.sp)

        // Show user data
        userData?.let {
            Text(text = "Name: ${it.name}")
            Text(text = "Age: ${it.age}")
            Text(text = "Is Adult: ${if (it.isAdult) "Yes" else "No"}")
            Text(text = "Dark mode: ${if (it.darkMode) "Yes" else "No"}")
        } ?: run {
            Text(text = "Loading user data...")
        }

        Spacer(modifier = Modifier.weight(1f))
        TextField(value = text, onValueChange = { viewModel.onTextChanged(it) })
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToDetail(text) }) {
            Text(text = "Navigate to detail screen")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
