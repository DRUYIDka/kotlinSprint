fun main() {
    val isDamageShip = readln().toBoolean()
    val crew : Int = readln().toInt()
    val boxWithEat: Int = readln().toInt()
    val isSunnyDay = readln().toBoolean()

    val isNecessaryCrew = crew in 55..70
    val isManyEat = boxWithEat > 50
    val compressionConditionFull = (!isDamageShip || isDamageShip) && (isManyEat || boxWithEat >= 50) && isNecessaryCrew && (isSunnyDay || !isSunnyDay)

    if(compressionConditionFull)
        println("Корабль готов отплыть")
    else
        println("Корабль not готов")


}