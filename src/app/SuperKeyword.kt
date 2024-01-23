package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    val shape = Shape()
    println("Shape corner = ${shape.corner}")

    val rectangle = Rectangle()
    println("Rectangle corner = ${rectangle.corner}")
    println("Rectangle parentCorner = ${rectangle.parentCorner}")

    val triangle = Triangle()
    println("Triangle corner = ${triangle.corner}")
    println("Triangle parentCorner = ${triangle.parentCorner}")

//    super pada function
    rectangle.printName()
}