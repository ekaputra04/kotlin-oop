package app

import data.Shape
import data.Triangle
import data.Rectangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)

    val triangle = Triangle()
    println(triangle.corner)
}