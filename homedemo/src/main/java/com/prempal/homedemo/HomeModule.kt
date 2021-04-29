package com.prempal.homedemo

import com.prempal.home.Navigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class HomeModule {

    @Binds
    abstract fun bindHomeNavigator(
        homeNavigator: HomeNavigator
    ): Navigator
}