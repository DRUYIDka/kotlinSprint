fun main() {
    var answerPeople = "Да"
    while (answerPeople == "Да") {
        repeatRound(answerPeople)
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        answerPeople = readln()
        if (answerPeople == "Нет") {
            repeatRound(answerPeople)
            return
        }
    }
}
fun generateValue() = (1..6).random()
fun repeatRound(answer: String) {
    var gainsPeople = 0
    val resultPeople = generateValue()
    val resultRobot = generateValue()
    if (answer == "Да") {
        println("Кость бросает человек")
        println(resultPeople)
        println("Кость бросает робот")
        println(resultRobot)
    }
    if (resultPeople > resultRobot) gainsPeople++
    if (answer == "Нет") {
        println("Выйгрышных партий человека - $gainsPeople")
        return
    }
}

