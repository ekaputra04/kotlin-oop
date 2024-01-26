package program

import annotations.Fancy

@Fancy("Eka")

class MyApplication(val name:String, val version:Int) {
    fun info():String{
        return "Application $name ~ version $version"
    }
}