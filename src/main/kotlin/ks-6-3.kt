fun main() {
    println("Введите нужное количество секнуд для отчета")
    var countSeconds = readln().toInt()

    do{
        println("Осталось секунд: $countSeconds")
        Thread.sleep(1000)
        countSeconds--
    } while (countSeconds > 0)
    println("Время вышло!")

}