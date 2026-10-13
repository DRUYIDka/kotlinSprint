import kotlin.random.Random

class DataTemperatureOfDay(_dayTemperature: Int, _nightTemperature: Int, _residuesPresence: Boolean) {
    val dayTemperature = _dayTemperature
    val nightTemperature = _nightTemperature
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
    val weatherIndicatorsList: MutableList<DataTemperatureOfDay> = mutableListOf()
    var countResidues = 0
    for (i in 1..30) {
        val isDayOfResidues = Random.nextBoolean()
        weatherIndicatorsList.add(DataTemperatureOfDay(Random.nextInt(-60, 60), Random.nextInt(-60, 60), isDayOfResidues))
        if(isDayOfResidues) countResidues++
    }
    val listIndicators =  weatherIndicatorsList.map {
        it.dayTemperature
        it.nightTemperature

    }


    println(listIndicators.average())
    println(countResidues)


}


