package com.example.android.dagger.user

import javax.inject.Scope

//このスコープは、ユーザーがログインしている期間をカバーする
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class LoggedUserScope