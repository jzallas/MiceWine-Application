package com.micewine.emu

import android.app.Application

class MiceWineApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: Application
    }
}