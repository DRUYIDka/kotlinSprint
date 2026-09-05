fun main() {
    println("Придумайте логин и пароль")
    val loginUserNew = readln()
    val passwordUserNew = readln()

    while (true) {
        println("Введите логин и пароль")
        val loginUser = readln()
        val passwordUser = readln()
        if ((loginUser == loginUserNew) && (passwordUser == passwordUserNew)) {
           println("Авторизация прошла успешно")
           break
        } else {
            continue
        }
    }

}