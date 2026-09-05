fun main() {
    var countAttempts = 3
    var firstNumber: Int
    var secondNumber: Int


    while (countAttempts > 0) {
        firstNumber = (1..9).random()
        secondNumber = (1..9).random()
        val result: Int = firstNumber + secondNumber
        println("Добро пожаловать, решите капчу\n Сложите два числа: $firstNumber + $secondNumber")
        val inputResultUser = readln().toInt()
        if (inputResultUser == result) {
            println("Добро пожаловать!")
            break
        }
        countAttempts--
        if (countAttempts == 0)
            println("Доступ запрещен")
    }

}