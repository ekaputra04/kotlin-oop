package data

class Car(paramName: String, paramBrand: String, paramYear: Int = 2020) {

    init {
        println("Car $paramName telah dibuat")
    }

    var name: String = paramName
    var brand: String = paramBrand
    var year: Int = paramYear
}