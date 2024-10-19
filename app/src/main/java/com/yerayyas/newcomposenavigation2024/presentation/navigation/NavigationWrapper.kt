package com.yerayyas.newcomposenavigation2024.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.toRoute
import com.yerayyas.newcomposenavigation2024.presentation.navigation.type.createNavType
import com.yerayyas.newcomposenavigation2024.presentation.screens.DetailScreen
import com.yerayyas.newcomposenavigation2024.presentation.screens.LoginScreen
import com.yerayyas.newcomposenavigation2024.presentation.screens.SettingsScreen
import com.yerayyas.newcomposenavigation2024.presentation.screens.HomeScreen
import com.yerayyas.newcomposenavigation2024.presentation.viewmodel.HomeViewModel
import kotlin.reflect.typeOf

@Composable
fun NavigationWrapper(viewModel: HomeViewModel = hiltViewModel()) {
    val navController = rememberNavController()
    val userData by viewModel.userData.collectAsState()

    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen { navController.navigate(Home) }
        }

        composable<Home> {
            HomeScreen(
                viewModel = viewModel,
                navigateToDetail = { name -> navController.navigate(Detail(name = name)) }
            )
        }

        composable<Detail> { backStackEntry ->
            val detail: Detail = backStackEntry.toRoute()
            DetailScreen(
                name = detail.name,
                navigateBack = { navController.navigateUp() },
                navigateToSettings = {
                    userData?.let { settingsInfo ->
                        navController.navigate(Settings(settingsInfo))
                    }
                }
            )
        }

        composable<Settings>(typeMap = mapOf(typeOf<SettingsInfo>() to createNavType<SettingsInfo>())) { backStackEntry ->
            val settings: Settings = backStackEntry.toRoute()
            SettingsScreen(settings.info)
        }
    }
}
