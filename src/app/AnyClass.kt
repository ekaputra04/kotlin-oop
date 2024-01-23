package app

import data.Laptop

fun main() {
    val laptop1=Laptop("ROG")
    val laptop2=Laptop("TUF")

    println(laptop1.toString())
    println(laptop1.hashCode())
    println(laptop1.equals(laptop2))
}