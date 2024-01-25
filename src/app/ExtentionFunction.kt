package app

import data.Student
import data.sayGoodBye
import data.sayHello

fun main() {
    val student = Student("Eka", 20)
    student.sayHello("Putra")

    student.sayGoodBye("Juniawan")
}