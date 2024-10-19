package com.yerayyas.newcomposenavigation2024.presentation.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Detail(val name: String)

@Serializable
data class Settings(val info:SettingsInfo)

@Parcelize
@Serializable
data class SettingsInfo(
    val name: String,
    val age: Int,
    val isAdult: Boolean,
    val darkMode: Boolean

) : Parcelable