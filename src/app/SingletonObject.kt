package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Utilities diubah"

    println(Utilities.toUpper("eka putra"))
    funA()
    funB()

//    inner object
    println(Application.Utilities.toUpper("juniawan"))
}

fun funA(){
    println(Utilities.name)
}

fun funB(){
    println(Utilities.name)
}