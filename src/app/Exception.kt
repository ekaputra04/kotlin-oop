package app

import exception.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
//    validateAndSayHello("Eka")
//    validateAndSayHello("") // error

//    untuk mengatasi error dengan try catch
//    catch bisa lebih dari 1
    try {
        validateAndSayHello("Eka")
        validateAndSayHello("")
    } catch (error: ValidationException) {
        println("Error with message ${error.message}")
    } catch (error: Throwable) {
        println("Error with message ${error.message}")
    } finally {
        println("Program selesai")
    }
}