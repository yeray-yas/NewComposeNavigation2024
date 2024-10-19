package com.yerayyas.newcomposenavigation2024.data.repository

import com.yerayyas.newcomposenavigation2024.presentation.navigation.SettingsInfo
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor() : UserRepository {
    override fun getUserData(): SettingsInfo {
        return SettingsInfo(name = "Yeray", age = 25, isAdult = true, darkMode = true)
    }
}
