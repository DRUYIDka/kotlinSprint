fun main() {
    println("Введите число для отчета")
    val inputNum = readln().toInt()
    val rangeProgression: IntProgression = 0 .. inputNum step 2

    for(i in rangeProgression){
        println(i)
    }
}