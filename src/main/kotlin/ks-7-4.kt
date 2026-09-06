import kotlin.concurrent.thread

fun main() {
    println("Введите время для отсчета")
    val endNumTimer = readln().toInt()

    for(i in endNumTimer downTo 1){
        println("Осталось секунд $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}