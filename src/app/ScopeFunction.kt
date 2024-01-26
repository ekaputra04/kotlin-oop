package app

import data.Student
import data.upperName

fun main() {
    val student = Student("Eka", 20)

//    biasanya kayak gini:
    println(student.name)
    println(student.upperName)

    student.let {
        println(it.name)
        println(it.upperName)
    }

    val result: String = student.let {
        "Student name is ${it.name} and the upper name is ${it.upperName}"
    }

    println(result)

    val result2: String = student.run {
        "Student name is ${this.name} and the upper name is ${this.upperName}"
    }

    println(result2)

    val result3: Student = student.apply {
        "Student name is ${this.name} and the upper name is ${this.upperName}"
    }

    println(result3)

    val result4: Student = student.also {
        "Student name is ${it.name} and the upper name is ${it.upperName}"
    }

    println(result4)

    val result5: String = with(student) {
        "Student name is ${this.name} and the upper name is ${this.upperName}"
    }

    println(result2)
}