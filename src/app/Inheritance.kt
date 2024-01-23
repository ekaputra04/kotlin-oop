package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Eka")
    manager.sayHello("Dwi")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Joko")

}