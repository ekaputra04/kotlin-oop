package app

import data.Television

fun main() {
    val television=Television()
//    println(television.brand) // error karena brand belum di isi data

    television.initTelevision("Samsung")
    println(television.brand)
}