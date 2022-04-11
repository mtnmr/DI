package com.example.android.dagger.user

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

//userがログインしている間だけ存在するcomponentを作成
//userがいつログインし、いつログアウトするまで知っているものとライフタイムとしたい　→　userManagerに追加
@LoggedUserScope
@Subcomponent
interface UserComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create():UserComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}