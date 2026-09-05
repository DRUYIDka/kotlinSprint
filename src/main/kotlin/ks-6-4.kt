import kotlin.random.Random

fun main() {
    var countAttempts = 5
    val numbers = Random.nextInt(1, 10)
    println("Введите любое число от 1 до 9")

    while (countAttempts > 0) {
        val inputNumber = readln().toInt()
        if (numbers == inputNumber) {
            println("Это была великолепная игра!")
            break
        }
        countAttempts--
        println("Число не угадано! Осталось попыток: $countAttempts")
        if (countAttempts == 0)
            println("Было загадано число $numbers")
    }

}