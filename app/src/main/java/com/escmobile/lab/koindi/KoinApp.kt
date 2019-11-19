package com.escmobile.lab.koindi

import android.app.Application
import com.escmobile.lab.koindi.koin.carModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@KoinApp)
            modules(carModule)
        }
    }
}