fun main() {
    println("Введите логин")
    val loginInput = readln()

    println("Введите пароль")
    val passwordInput = readln()
    val isValidFunction = isCheckedPassword(loginInput, passwordInput)

    if (!isValidFunction) println("Логин или пароль недостаточно длинные")
    else println("Регистрация прошла успешно")
}

fun isCheckedPassword(login: String, password: String): Boolean {
    return login.length < 4 || password.length < 4
}