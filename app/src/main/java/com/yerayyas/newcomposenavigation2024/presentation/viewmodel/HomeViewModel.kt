package com.yerayyas.newcomposenavigation2024.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.yerayyas.newcomposenavigation2024.domain.usecase.GetUserDataUseCase
import com.yerayyas.newcomposenavigation2024.presentation.navigation.SettingsInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getUserDataUseCase: GetUserDataUseCase
) : ViewModel() {
    private val _userData = MutableStateFlow<SettingsInfo?>(null)
    val userData: StateFlow<SettingsInfo?> = _userData

    init {
        loadUserData()
    }

    private fun loadUserData() {
        _userData.value = getUserDataUseCase()
    }

    private val _textFieldValue = MutableStateFlow("")
    val textFieldValue: StateFlow<String> = _textFieldValue

    fun onTextChanged(newText: String) {
        _textFieldValue.value = newText
    }
}


