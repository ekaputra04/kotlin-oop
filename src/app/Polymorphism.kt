package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee = Employee("Eka")
    employee.sayHello("Budi")

    employee = Manager("Eka")
    employee.sayHello("Budi")

    employee = VicePresident("Eka")
    employee.sayHello("Budi")

}