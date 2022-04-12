package com.example.android.dagger.di

import com.example.android.dagger.di.AppComponent
import com.example.android.dagger.di.AppSubcomponents
import com.example.android.dagger.di.TestStorageModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestStorageModule::class, AppSubcomponents::class])
interface TestAppComponent : AppComponent