const val AGE_OF_LEGAL = 18
fun main() {
    val inputYear = readln().toInt()

    val result = if ((2026 - inputYear) >= AGE_OF_LEGAL) {
        "Показать экран со скрытым контентом"
    } else {

    }

    println(result)
}