package data

interface Base {
    fun sayHello(name: String)
    fun sayGoodBye(name: String)

}

class MyBase() : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodBye(name: String) {
        println("Goodbye $name")
    }
}

class MyBaseDelegate(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
    override fun sayGoodBye(name: String) {
        base.sayGoodBye(name)
    }
}