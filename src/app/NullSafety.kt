package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//    jika null maka tetap dieksekusi
    println("Hello ${friend?.name}")

//    untuk mengecek apakah null atau tidek
    if (friend != null) {
        println("Hello ${friend.name}")
    }

//    jika null, dapat ditambahkan elvis operator
    val name = friend?.name ?: ""
    println("Hello $name")

//    jika sudah yakin datanya sudah pasti bukan null, jika data null maka error
//    val nameBisaNull = friend!!.name ?: ""
//    println("Hello $nameBisaNull")
}

fun main() {
    sayHello(null)
    println("===================")
    sayHello(Friend("Eka"))
}