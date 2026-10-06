const val CONVERT_TO_KELVIN: Int = -273

class DataTemperatureOfDay(_dayTemperature: Int, _nightTemperature: Int, _residuesPresence: Boolean) {
    var dayTemperature = _dayTemperature + CONVERT_TO_KELVIN
    var nightTemperature = _nightTemperature + CONVERT_TO_KELVIN
    var isResiduesPresence = _residuesPresence

    fun dataAboutDay() {
        println(
            "Дневная температура: $dayTemperature, " +
                    "ночная температура: $nightTemperature, " +
                    "наличие осадков: ${if (isResiduesPresence) "Да" else "Нет"}"
        )
    }
}

fun main() {
    val allDataOfDay1 = DataTemperatureOfDay(300, -10, false)
    allDataOfDay1.dataAboutDay()
    val allDataOfDay2 = DataTemperatureOfDay(210, 0, true)
    allDataOfDay2.dataAboutDay()

}



