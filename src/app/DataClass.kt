package app

import data.Product

fun main() {
    val product = Product("Indomie", 3000, "Food")

    println(product)

    val product2=product.copy(name = "Supermie")

    println(product2)
}