package data

class Car(paramName: String, paramBrand: String, paramYear: Int) {

    init {
        println("Car $paramName telah dibuat")
    }

    constructor(paramName: String, paramBrand: String) : this(paramName, paramBrand, 2020) {
        println("Secondary constructor 1")
    }

    constructor(paramName: String) : this(paramName, "") {
        println("Secondary constructor 2")
    }

    var name: String = paramName
    var brand: String = paramBrand
    var year: Int = paramYear
}