package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    val employee = Employee("Jaka")
    employee.sayHello("Bagus")

    val manager = Manager("Jiki")
    manager.sayHello("Bagus")

    val vicePresident = VicePresident("Juku")
    vicePresident.sayHello("Bagus")
}