package data

class Boss (val bossName:String){
    inner class Employee(val name: String){
        fun sayHello(){
            println("Hello I'm $name, and my boss name is ${this@Boss.bossName}")
        }
    }
}