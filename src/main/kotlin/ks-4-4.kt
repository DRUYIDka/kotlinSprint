fun main() {
    var dayTraining = 5
    var isHandsDay = true
    var isFootDay = false
    var isBackDay = false
    var isTorceDay = true

    if(dayTraining % 2 == 0)
        println("""
            Упражнения для рук: ${!isHandsDay}
            Упражнения для ног: ${!isFootDay}
            Упражнения для спины: false ${!isBackDay}
            Упражнения для пресса: true ${!isTorceDay}
        """.trimIndent())
}