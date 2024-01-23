package app

import data.City
import data.Location

fun main() {
//    val location = Location("Gianyar") // error
    val city = City("Gianyar")
    val country = City("Gianyar")

    println(city.name)
    println(country.name)
}