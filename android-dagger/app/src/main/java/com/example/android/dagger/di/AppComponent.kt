package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {

    //Storageはcontextを引数に持つ、ContextはAndroidシステムから提供される（グラフの外側で構築される）
    //このグラフの外側で構築されるインスタンスを作る
    @Component.Factory
    interface Factory{
        //@BindsInstanceでDaggerにそのインスタンスをグラフに追加する必要があることを伝える
        fun create(@BindsInstance context: Context) : AppComponent
    }

    fun inject(activity: RegistrationActivity)

    fun inject(activity: MainActivity)
}