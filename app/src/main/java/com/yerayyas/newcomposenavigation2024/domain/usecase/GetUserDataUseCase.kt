package com.yerayyas.newcomposenavigation2024.domain.usecase

import com.yerayyas.newcomposenavigation2024.data.repository.UserRepository
import com.yerayyas.newcomposenavigation2024.presentation.navigation.SettingsInfo
import javax.inject.Inject

class GetUserDataUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(): SettingsInfo {
        return userRepository.getUserData()
    }
}


