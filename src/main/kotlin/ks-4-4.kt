fun main() {
    val dayTraining = 5
    val isHandsDay = true
    val isFootDay = false
    val isBackDay = false
    val isTorceDay = true

    if(dayTraining % 2 == 0)
        println("""
            |Упражнения для рук: ${!isHandsDay}
            |Упражнения для ног: ${!isFootDay}
            |Упражнения для спины: ${!isBackDay}
            |Упражнения для пресса: ${!isTorceDay}
        """.trimMargin())
    else
        println("""
            |Упражнения для рук: ${isHandsDay}
            |Упражнения для ног: ${isFootDay}
            |Упражнения для спины: ${isBackDay}
            |Упражнения для пресса: ${isTorceDay}
        """.trimMargin())
}