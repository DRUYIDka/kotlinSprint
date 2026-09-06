fun main() {
    do {
        val codeSMS = (1000..9999).random()
        println("Ваш код авторизации: $codeSMS")
        println("Введите код авторизации")
        val inputCode = readln().toInt()
        if (inputCode == codeSMS) {
            println("Добро пожаловать!")
            break
        }
        println("Неверный код")
    } while (true)

}