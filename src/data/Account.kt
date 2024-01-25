package data

class Account {
    val name:String by lazy {
        println("name is called")
        "Eka"
    }
}