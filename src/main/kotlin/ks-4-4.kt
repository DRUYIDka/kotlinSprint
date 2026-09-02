fun main() {
    val dayTraining = 5
    val isHandsDay = true
    val isFootDay = false
    val isBackDay = false
    val isTorceDay = true
    var finalString: String

    if(dayTraining % 2 != 0)
        finalString = "Упражнения для рук:    $isHandsDay\n" +
                "Упражнения для ног:    $isFootDay\n" +
                "Упражнения для спины:  ${(isBackDay)}\n" +
                "Упражнения для пресса: $isTorceDay";
    else
        finalString = "Упражнения для рук:    $isHandsDay\n" +
                "Упражнения для ног:   $isFootDay\n" +
                "Упражнения для спины: $isBackDay\n" +
                "Упражнения для пресса: $isTorceDay";
    println(finalString)
}
