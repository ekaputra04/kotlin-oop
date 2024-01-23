package app

import data.Address

fun main() {
    val address1 = Address("Melati", "Gianyar")
    println(address1.street)
    println(address1.city)
    println(address1.province)

}