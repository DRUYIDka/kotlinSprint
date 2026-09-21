fun main() {
    var gainsPeople = 0
    var answerPeople : String
    do {
        if (repeatRound()) {
            gainsPeople++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        answerPeople = readln()
    } while (answerPeople == "Да")

    println("Выйгрышных партий человека - $gainsPeople")
}

fun generateValue() = (1..6).random()
fun repeatRound(): Boolean {
    var isWinPeople: Boolean = true
    val resultPeople = generateValue()
    val resultRobot = generateValue()

    println("Кость бросает человек")
    println(resultPeople)
    println("Кость бросает робот")
    println(resultRobot)

    if (resultPeople > resultRobot) {
        isWinPeople = true
    } else {
        isWinPeople = false
    }
    return isWinPeople
}

