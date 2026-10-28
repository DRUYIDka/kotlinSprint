abstract class WeatherStationStats(val count: Double)
class Temperature(count: Double) : WeatherStationStats(count)
class PrecipitationAmount(count: Double) : WeatherStationStats(count)
class WeatherServer() {
    fun sendMessage(informationWeather: WeatherStationStats) {
        if (informationWeather is Temperature) {
            println("${informationWeather.count} градусов")
        } else if (informationWeather is PrecipitationAmount) {
            println("${informationWeather.count} мм рт.ст.")
        }
    }
}

fun main() {
    val temperature = Temperature(20.4)
    val precipitationAmount = PrecipitationAmount(12.5)
    WeatherServer().sendMessage(temperature)
    WeatherServer().sendMessage(precipitationAmount)
}