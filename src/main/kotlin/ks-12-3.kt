const val CONVERT_TO_KELVIN: Double = -273.15

class DataTemperatureOfDay() {
    var dayTemperature = 0
    var nightTemperature = 0
    var isResiduesPresence = false

    fun dataAboutDay() {
        println(
            "Дневная температура: ${dayTemperature + CONVERT_TO_KELVIN}, " +
                    "ночная температура: ${nightTemperature + CONVERT_TO_KELVIN}, " +
                    "наличие осадков: ${if (isResiduesPresence) "Да" else "Нет"}"
        )
    }
}

fun main() {
    val allDataOfDay1 = DataTemperatureOfDay()
    allDataOfDay1.dayTemperature = 300
    allDataOfDay1.nightTemperature = -100
    allDataOfDay1.isResiduesPresence = false
    allDataOfDay1.dataAboutDay()
    val allDataOfDay2 = DataTemperatureOfDay()
    allDataOfDay2.dayTemperature = 290
    allDataOfDay2.nightTemperature = 100
    allDataOfDay2.isResiduesPresence = true
    allDataOfDay2.dataAboutDay()

}