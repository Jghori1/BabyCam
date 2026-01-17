package com.example.babycamapp.di

import com.andyha.coreui.base.navigation.AppNavigator

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import com.example.babycamapp.navigation.StubAppNavigator
import dagger.hilt.android.scopes.ActivityScoped


@InstallIn(ActivityComponent::class)
@Module
abstract class NavigationModule {

    @Binds
    @ActivityScoped
    abstract fun provideAppNavigator(impl: StubAppNavigator): AppNavigator
}