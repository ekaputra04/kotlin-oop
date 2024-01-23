package app

import data.Handphone
import data.Laptop

fun printObjectWithIf(any: Any) {
    if (any is Laptop) {
        println("Laptop ${any.name}")
    } else if (any is Handphone) {
        println("Handphone ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop ${any.name}")
        is Handphone -> println("Handphone ${any.name}")
        else -> println(any)
    }
}

// bahaya melakukan konversi secara paksa
fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSave(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObjectWithIf("Eka")
    printObjectWithIf(1)
    printObjectWithIf(Laptop("Lenovo"))
    printObjectWithIf(Handphone("Samsung"))

    printObjectWithWhen("Putra")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Lenovo"))
    printObjectWithWhen(Handphone("Samsung"))

    printString("Juniawan")
//    printString(100) // error

    printStringSave(100) // jika gagal, maka hasilnya null
}