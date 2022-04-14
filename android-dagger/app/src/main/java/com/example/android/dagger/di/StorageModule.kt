package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class StorageModule {
    // Makes Dagger provide SharedPreferencesStorage when a Storage type is requested
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}

//@Providesを使って以下のようにも書ける
@Module
class StorageModuleProvide {

    @Provides
    fun provideStorage(context: Context):Storage{
        return SharedPreferencesStorage(context)
    }
}