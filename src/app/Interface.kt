package app

import data.Human

fun main() {
    val human = Human("Eka")
    human.sayHello("Dwi")

    human.go()
    human.move()
}