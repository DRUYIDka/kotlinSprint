fun main() {
    val isDamageShip = readln().toBoolean()
    val crew : Int = readln().toInt()
    val boxWithEat: Int = readln().toInt()
    val isSunnyDay = readln().toBoolean()

    val isNecessaryCrew = crew in 55..70
    val isManyEat = boxWithEat > 50
    val compressionConditionFull = (isDamageShip == false && isNecessaryCrew && isManyEat) || (boxWithEat >= 50 && isSunnyDay == true && crew == 70)

    if(compressionConditionFull)
        println("Корабль готов отплыть")
    else
        println("Корабль не готов")


}