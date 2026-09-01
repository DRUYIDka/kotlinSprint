fun main() {
    val dayTraining = 5
    var isHandsDay = true
    var isFootDay = false
    var isBackDay = false
    var isTorceDay = true

    if(dayTraining % 2 == 0)
        println("""
            Упражнения для рук: ${!isHandsDay}
            Упражнения для ног: ${!isFootDay}
            Упражнения для спины: ${!isBackDay}
            Упражнения для пресса: ${!isTorceDay}
        """.trimIndent())
    else
        println("""
            Упражнения для рук: ${isHandsDay}
            Упражнения для ног: ${isFootDay}
            Упражнения для спины: ${isBackDay}
            Упражнения для пресса: ${isTorceDay}
        """.trimIndent())
}