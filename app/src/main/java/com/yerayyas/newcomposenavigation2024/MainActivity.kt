package com.yerayyas.newcomposenavigation2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yerayyas.newcomposenavigation2024.presentation.navigation.NavigationWrapper
import com.yerayyas.newcomposenavigation2024.ui.theme.NewComposeNavigation2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewComposeNavigation2024Theme {
              NavigationWrapper()
            }
        }
    }
}
