package app

import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException

fun validateRequest(request: CreateProductRequest) {
    if (request.id == "") {
        throw ValidationException("id is blank")
    } else if (request.name == "") {
        throw ValidationException("name is blank")
    }
}

fun validateRequest(request: CreateCategoryRequest) {
    if (request.id == "") {
        throw ValidationException("id is blank")
    } else if (request.name == "") {
        throw ValidationException("name is blank")
    }
}

fun main() {
    val request = CreateProductRequest("1", "", 3000)
    validateRequest(request)
}
