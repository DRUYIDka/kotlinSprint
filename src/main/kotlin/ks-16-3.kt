class User(val login: String, password: String) {
    private val passwordOriginal = password

    fun checkPassword(passwordInput: String): Boolean {
        return passwordInput == passwordOriginal
    }
}

fun main() {
    val user = User("Anya", "123456")
    val trueInput = user.checkPassword("123456")
    if (trueInput) println("Пароль введён верно")
}