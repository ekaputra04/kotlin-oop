package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher=Teacher("Eka")

    println(teacher.name)
//    teacher.teach() // error karena function teach bersifat private

    val superTeacher=SuperTeacher("Putra")
//    superTeacher.presentation() // error karena function teach bersifat protected
}