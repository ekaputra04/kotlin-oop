package app

import data.Car

fun main() {
    val avanza = Car("Avanza", "Toyota", 2010)

    avanza.year = 2019

    println("Nama mobil: ${avanza.name}")
    println("Brand mobil: ${avanza.brand}")
    println("Tahun mobil: ${avanza.year}")

//    secondary constructor
    val almaz =Car("Almaz")
    println("Nama mobil: ${almaz.name}")
    println("Brand mobil: ${almaz.brand}")
    println("Tahun mobil: ${almaz.year}")

}