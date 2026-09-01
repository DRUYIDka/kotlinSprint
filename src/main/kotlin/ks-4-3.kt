const val HOMIDITY = 20
const val SEASON = "зима"

fun main() {
    val weather: Boolean = true
    val tent: Boolean = true

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(weather == true) && (tent == true) && (HOMIDITY == 20) && (SEASON == "не зима")}")
}