fun main() {
    var gainsPeople = 1
    println("Кость бросает человек")
    val resultPeople = generateValue()
    println(resultPeople)
    println("Кость бросает робот")
    val resultRobot = generateValue()
    println(resultRobot)
    if (resultPeople > resultRobot)
        gainsPeople++
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val answerPeople = readln()
    repeatRound(answerPeople, gainsPeople)
}

fun generateValue() = (1..6).random()
fun repeatRound(answer: String, gains: Int){
    if(answer == "Да") main()
    else if(answer == "Нет"){
        println("Выйгрышных партий человека - $gains")
    }
}

