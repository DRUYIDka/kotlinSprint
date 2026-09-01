const val AIR_HUMIDITY = 20
const val SEASON = "зима"

fun main() {
    val weather: Boolean = true
    val tent: Boolean = true

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(weather == true) && (tent == true) && (AIR_HUMIDITY == 20) && (SEASON != "зима")}")
}