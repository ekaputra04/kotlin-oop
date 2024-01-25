package data

open class Teacher(val name: String) {
    private fun teach() {
        println("Teaching by ${this.name}")
    }

    open protected fun presentation(){
        println("Presentation by ${this.name}")
    }
}

class SuperTeacher(name: String):Teacher(name){
    override fun presentation() {
        super.presentation()
    }
}