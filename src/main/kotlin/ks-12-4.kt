const val CONVERT_TO_KELVIN: Int = -273

class DataTemperatureOfDay(_dayTemperature: Int, _nightTemperature: Int, _residuesPresence: Boolean) {
    val dayTemperature = _dayTemperature + CONVERT_TO_KELVIN
    val nightTemperature = _nightTemperature + CONVERT_TO_KELVIN
    val isResiduesPresence = _residuesPresence

    init {
        println(
            "Дневная температура: $dayTemperature, " +
                    "ночная температура: $nightTemperature, " +
                    "наличие осадков: ${if (isResiduesPresence) "Да" else "Нет"}"
        )
    }
}

fun main() {
    DataTemperatureOfDay(300, -10, false)
    DataTemperatureOfDay(210, 0, true)

}



