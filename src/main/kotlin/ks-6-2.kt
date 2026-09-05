fun main() {
    println("Введите колиечтсво секунд, которые надо засечь")
    var countSeconds = readln().toInt()
    val inputSeconds = countSeconds

    while (countSeconds > 0) {
        Thread.sleep(1000)
        countSeconds--
    }
    println("Прошло $inputSeconds секунд")
}