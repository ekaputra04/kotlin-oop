package data

class Student(val name: String, private val age: Int)

fun Student.sayHello(name: String) {
//    println("Hello $name, my name is ${this.name} and my age is ${this.age}") // age error karena  bersifat private
}

fun Student?.sayGoodBye(name: String) {
    if (this != null) {
        println("Goodbye, $name, my name is ${this.name}")
    }
}

val Student.upperName: String
    get() = this.name.uppercase()