package data

class Address {
    var street: String = ""
    var city: String = ""
    var province: String = "Bali"

    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramProvince: String) : this(paramStreet, paramCity) {
        province = paramProvince
    }
}