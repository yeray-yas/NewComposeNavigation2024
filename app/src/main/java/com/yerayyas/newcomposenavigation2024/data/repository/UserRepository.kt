package com.yerayyas.newcomposenavigation2024.data.repository

import com.yerayyas.newcomposenavigation2024.presentation.navigation.SettingsInfo

interface UserRepository {
    fun getUserData(): SettingsInfo
}
