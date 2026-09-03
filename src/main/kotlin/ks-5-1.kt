fun main() {
    println("Введите ответ для следующей математической задачи: 2+3")
    val inputNum = readln().toInt()
    //val isTrueResult = inputNum == 5

    if (inputNum == 5){
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}