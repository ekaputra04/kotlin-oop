package app

import data.Gender
import kotlin.enums.EnumEntries

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGender: EnumEntries<Gender> = Gender.entries

    val manFromString =Gender.valueOf("MALE")
    val womanFromString =Gender.valueOf("FEMALE")

    println(manFromString)
    println(womanFromString)
    println(allGender.toList())

    man.showDescription()
    woman.showDescription()
}