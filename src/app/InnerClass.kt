package app

import data.Boss
import data.Employee

fun main() {
    val boss1 = Boss("Eka")

    val employee1 = boss1.Employee("Joko")
    val employee2 = boss1.Employee("Budi")

    println(boss1.bossName)
    employee1.sayHello()
    employee2.sayHello()

    val boss2 = Boss("Putra")

    val employee3 = boss2.Employee("Joko")
    val employee4 = boss2.Employee("Budi")

    println(boss2.bossName)
    employee3.sayHello()
    employee4.sayHello()
}