package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Eka")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Putra")

    baseDelegate.sayGoodBye("Juniawan")
}