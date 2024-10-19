package com.yerayyas.newcomposenavigation2024.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.yerayyas.newcomposenavigation2024.presentation.navigation.type.createNavType
import com.yerayyas.newcomposenavigation2024.presentation.navigation.type.settingsInfoType
import com.yerayyas.newcomposenavigation2024.presentation.screens.DetailScreen
import com.yerayyas.newcomposenavigation2024.presentation.screens.HomeScreen
import com.yerayyas.newcomposenavigation2024.presentation.screens.LoginScreen
import com.yerayyas.newcomposenavigation2024.presentation.screens.SettingsScreen
import kotlin.reflect.typeOf

@Composable
fun NavigationWrapper() {

    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Login) {
        composable<Login> {
            LoginScreen { navHostController.navigate(Home) }
        }
        composable<Home> {
            HomeScreen { name -> navHostController.navigate(Detail(name = name)) }
        }
        composable<Detail> { navBackStackEntry ->
            val detail: Detail = navBackStackEntry.toRoute()
            DetailScreen(
                name = detail.name,
                navigateToSettings = { navHostController.navigate(Settings(it))},
                navigateBack = { navHostController.navigateUp() }
            )
        }
        composable<Settings>(typeMap = mapOf(typeOf<SettingsInfo>() to createNavType<SettingsInfo>())) { navBackStackEntry ->
            val settings: Settings = navBackStackEntry.toRoute()
            SettingsScreen(settings.info)
        }
    }
}
