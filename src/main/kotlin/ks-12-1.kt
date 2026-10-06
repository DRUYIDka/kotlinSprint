class DataTemperature(){
    var dayTemperature = ""
    var nightTemperature = ""
    var residuesPresence = false

    fun dataAboutDay(){
        println("Дневная температура: $dayTemperature, " +
                "ночная температура: $nightTemperature, " +
                "наличие осадков: $residuesPresence")
    }
}
fun main(){
    val informationWeather = DataTemperature()
    informationWeather.dayTemperature = "+10"
    informationWeather.nightTemperature = "-2"
    informationWeather.residuesPresence = true
    informationWeather.dataAboutDay()

    val informationWeather2 = DataTemperature()
    informationWeather2.dayTemperature = "+15"
    informationWeather2.nightTemperature = "0"
    informationWeather2.dataAboutDay()
}