package app

import data.Shape
import data.Triangle
import data.Rectangle

fun main() {
    val shape = Shape()
    println("Shape corner = ${shape.corner}")

    val rectangle = Rectangle()
    println("Rectangle corner = ${rectangle.corner}")

    val triangle = Triangle()
    println("Triangle corner = ${triangle.corner}")
}