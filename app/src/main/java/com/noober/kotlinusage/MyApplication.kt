package com.noober.kotlinusage

import android.app.Application
import kotlin.properties.Delegates

class MyApplication : Application() {

    companion object{
        var context: Application by Delegates.notNull()
        var context2: Application? = null
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        context2 = this
    }
}