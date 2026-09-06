import kotlin.random.Random

fun main() {
    val char = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    var lengthPassword = readln().toInt()
    var pin = ""

    while (lengthPassword < 6) {
        println("Пароль не должен быть короче 6 символов")
        lengthPassword = readln().toInt()
    }

    for (i in 1..lengthPassword) {
        pin += char.random()
        for (ch in pin) {
            if (ch.isUpperCase() && ch.isDigit() && ch.isLowerCase() && pin.length == lengthPassword) {
                break
            }
        }
    }
    println(pin)
}