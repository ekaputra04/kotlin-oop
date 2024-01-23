package app

import data.Person

fun main() {
    val eka = Person()
    eka.firstName = "Eka"
    eka.middleName = "Putra"
    eka.lastName = "Juniawan"

    eka.sayHello(("Dwi"))
    eka.run()
    var ekaFullName = eka.getFullName()
    println(ekaFullName)
}