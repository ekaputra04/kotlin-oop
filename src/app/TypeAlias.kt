package app

import data.Application

typealias Aplikasi = data.Application
typealias App = Aplikasi

typealias App2 = data2.Application

typealias StringSupplier =()->String
fun sayHello(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    println(Aplikasi.toLower("GANTENG"))
    println(App.toLower("BANGET"))

    println(App2.toLower("DEH"))

    sayHello { "Eka" }

}