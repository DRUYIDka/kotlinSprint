class InfoDataTemperature(val dayTemperature: Int, val nightTemperature: Int, val residuesPresence: Boolean) {

    fun dataAboutDay() {
        println(
            "Дневная температура: $dayTemperature, " +
                    "ночная температура: $nightTemperature, " +
                    "наличие осадков: $residuesPresence"
        )
    }
}

fun main() {
    val allDataOfDay1 = InfoDataTemperature(15, 0, true)
    allDataOfDay1.dataAboutDay()
    val allDataOfDay2 = InfoDataTemperature(10, -1, false)
    allDataOfDay2.dataAboutDay()

}