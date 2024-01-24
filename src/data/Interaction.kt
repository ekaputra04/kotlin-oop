package data

interface Interaction {
//    dalam interface, variabel tidak boleh di isikan data
//    tetapi function boleh dideklarasikan bodynya. Jika sudah memiliki body, maka boleh tidak meng override functions pada class turunannya

    val name: String
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")

    }
}

interface Go : Interaction {
    fun go() {
        println("On going")
    }
}

interface MoveA{
    fun move(){
        println("Move A")
    }
}

interface MoveB{
    fun move(){
        println("Move B")
    }
}

class Human(override val name: String) : Go, MoveA,MoveB {
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is ${this.name}")
//    }

//    jika ada method yang sama pada interface yang berbeda, harus kita deklarasikan ulang method pada class turunannya

    override fun move(){
        println("Human Move")
        super<MoveA>.move()
        super<MoveB>.move()
    }
}