package com.noober.kotlinusage

import android.app.Application
import org.junit.Test
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class KotlinTest {

    var observerValue by Delegates.observable("1"){
            property: KProperty<*>, s: String, s1: String ->
        println("$s -> $s1")
    }

    @Test
    fun changeValue(){
        observerValue = "222" // 打印 1 -> 222
    }

    var any: Any? = null

    fun inLinefun(){
        any?.let {

        }
    }

}