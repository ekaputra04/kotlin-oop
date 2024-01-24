package app

import data.Note

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote=BigNote("belajar kotlin")
    println(bigNote.title)
    println(bigNote.bigNote)
}

class BigNote(val title: String) {
    val bigNote: String
        get() = title.uppercase()
}