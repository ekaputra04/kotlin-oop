package app

fun main() {
    val premiumCustomer = PremiumCustomer("Eka")
    println(premiumCustomer.name)
    println(premiumCustomer.type)
    println(premiumCustomer.balance)

    val executiveCustomer = ExecutiveCustomer("Putra")
    println(executiveCustomer.name)
    println(executiveCustomer.type)
    println(executiveCustomer.balance)
}