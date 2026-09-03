const val AGE_OF_LEGAL = 18
fun main() {
    val inputYear = readln().toInt()

    if ((2026 - inputYear) >= AGE_OF_LEGAL) {
        println("Показать экран со скрытым контентом")
    }


}