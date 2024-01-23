package app

import data.Person

fun main() {
    val eka = Person()
    eka.firstName = "Eka"
    eka.middleName = "Putra"
    eka.lastName = "Juniawan"

    println(eka.firstName)
    println(eka.middleName)
    println(eka.lastName)
}