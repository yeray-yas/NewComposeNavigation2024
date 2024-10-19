package com.yerayyas.newcomposenavigation2024.di

import com.yerayyas.newcomposenavigation2024.data.repository.UserRepository
import com.yerayyas.newcomposenavigation2024.data.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepositoryImpl() // Puedes usar una implementación diferente si es necesario
    }
}
