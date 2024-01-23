package data

open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, my name is manager ${this.name}")
    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is vice president ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {
//    error => karena fun sayHello pada class Manager bersifat final, maka tidak bisa di override oleh kelas di bawahnya

//    override fun sayHello(name: String) {
//        println("Hello $name, my name is super manager ${this.name}")
//    }
}
