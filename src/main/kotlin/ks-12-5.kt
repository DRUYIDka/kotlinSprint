import kotlin.random.Random

class DataTemperatureOfDay(_dayTemperature: Int, _nightTemperature: Int, _residuesPresence: Boolean) {
    val dayTemperature = _dayTemperature
    val nightTemperature = _nightTemperature
    val isResiduesPresence = _residuesPresence

    fun inputDatWeather() {
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
    val listIndicatorsDay =  weatherIndicatorsList.map {
        it.dayTemperature

    }
    val listIndicatorsNight = weatherIndicatorsList.map{
        it.nightTemperature
    }

    println("Среднее по показателям дневной температуры: " + listIndicatorsDay.average())
    println("Среднее по показателям ночной температуры: " + listIndicatorsNight.average())

    println("Количество дней с осадками: $countResidues")


}


