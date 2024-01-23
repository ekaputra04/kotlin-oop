package app

import data.Car

fun main() {
    val avanza = Car("Avanza", "Toyota", 2010)

    avanza.year = 2019

    println("Nama mobil: ${avanza.name}")
    println("Brand mobil: ${avanza.brand}")
    println("Tahun mobil: ${avanza.year}")

}