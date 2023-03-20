package com.example.myapplication

import android.app.Application

class App(): Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().appModule(AppModule()).build()
    }

    override fun onCreate() {
        super.onCreate()
    }

}