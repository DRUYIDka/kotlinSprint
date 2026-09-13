fun main() {
    println("Кость бросает человек")
    val resultPeople = isResultRandom()
    println(resultPeople)
    println("Кость бросает робот")
    val resultRobot = isResultRandom()
    println(resultRobot)


    if(resultPeople > resultRobot){
        println("Победило человечество")
    } else if(resultPeople < resultRobot) println("Победила машина")
    else println("Победила дружба")
}

fun isResultRandom() = (1..6).random()