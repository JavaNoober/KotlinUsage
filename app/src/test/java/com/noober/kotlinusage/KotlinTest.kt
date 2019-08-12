package com.noober.kotlinusage

import android.app.Application
import android.view.View
import org.junit.Test
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class LazyMember{
    fun doSomethings(){}
    fun doSomethings2(){}
}

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

    fun afterMeasureTest(view: View){
        view.afterMeasure {
            setOnClickListener {

            }
        }

        view.afterMeasure2 {
//            thi
        }
    }


    val member by lazy { LazyMember() }

    fun lazyMemberTest(){
        member.doSomethings()
    }

    fun lambdaFun(boolean: Boolean, block: (Int) -> Unit){

    }

    fun lambdaFunTest(){
        lambdaFun(true, block = {

        })

        lambdaFun(true){

        }
    }
}


fun <T : View> T.afterMeasure(f: T.() -> Unit) {
}

fun <T : View> T.afterMeasure2(f: () -> Unit) {

}




//fun <T> Observable<T>.setThread(): Observable<T> {
//    return subscribeOn(Schedulers.io())
//        .observeOn(AndroidSchedulers.mainThread())
//}
//
//fun <V : View> Activity.bindView(id: Int): Lazy<V> {
//    return lazy { findViewById<V>(id) }
//}

