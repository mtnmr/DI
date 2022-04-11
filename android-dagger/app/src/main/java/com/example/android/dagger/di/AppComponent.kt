package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    //Storageはcontextを引数に持つ、ContextはAndroidシステムから提供される（グラフの外側で構築される）
    //このグラフの外側で構築されるインスタンスを作る
    @Component.Factory
    interface Factory{
        //@BindsInstanceでDaggerにそのインスタンスをグラフに追加する必要があることを伝える
        fun create(@BindsInstance context: Context) : AppComponent
    }

    //RegistrationComponentファクトリーを公開するには、このクラスを戻り値として関数を宣言する
    fun registrationComponent(): RegistrationComponent.Factory

    fun loginComponent(): LoginComponent.Factory

    //UserComponentを使うにはUserManagerが必要、公開しておく
    fun userManager():UserManager
}