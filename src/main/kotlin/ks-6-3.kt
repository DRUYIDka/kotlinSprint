fun main() {
    println("Введите нужное количество секнуд для отчета")
    var countSeconds = readln().toInt()

    do{
        println("Осталось ${countSeconds--} секунд")
        Thread.sleep(1000)
    } while (countSeconds > 0)
    println("Время вышло!")

}