package data

class Application {
    object Utilities {
        var name: String = "My utilities"
        fun toUpper(value: String): String {
            return value.uppercase()
        }
    }
}