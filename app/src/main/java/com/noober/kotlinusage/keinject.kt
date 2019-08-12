package com.noober.kotlinusage

import android.app.Activity
import android.view.View


fun <V : View> Activity.bindView(id: Int): Lazy<V> {
    return lazy { findViewById<V>(id) }
}

