const val ALL_TABLESS = 13

fun main() {
    val todayBooking = 13
    val tomorrowBooking: Int = 9

    println("Доступность столиков на сегодня: ${todayBooking < ALL_TABLESS}\nДоступность столиков на завтра: ${tomorrowBooking < ALL_TABLESS}")
}