package com.yerayyas.newcomposenavigation2024.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yerayyas.newcomposenavigation2024.presentation.navigation.NavigationWrapper
import com.yerayyas.newcomposenavigation2024.ui.theme.NewComposeNavigation2024Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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
