import kotlin.random.Random

fun main() {
    val letter = ('a'..'z').toList()
    val letterUp = ('A'..'Z').toList()
    val digit = ('0'..'9').toList()
    val chars = letter + letterUp + digit
    var pin = ""
    println("Введите длину пароля")
    var countLength = readln().toInt()

    while (countLength < 6){
        println("Ж")
        countLength = readln().toInt()
    }

    chars.forEachIndexed { index, ch ->
        while (!(ch.isLowerCase() && ch.isDigit() && ch.isUpperCase()) && countLength > 0) {
            pin += chars.random()
            countLength--
        }
    }

    println(pin)
}