fun main() {
    println("Нужно угадать два числа от 0 до 42, введите первое число")
    val firstNum = readln().toInt()
    println("Введите второе число")
    val secondNum = readln().toInt()
    val trueFirstNum: Int = 23
    val trueSecondNum: Int = 4
    val combinationOne: Boolean = ((firstNum == trueFirstNum) || (secondNum == trueFirstNum))
    val combinationTwo: Boolean = ((firstNum == trueSecondNum) || (secondNum == trueSecondNum))
    if (combinationOne && combinationTwo) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (combinationOne || combinationTwo) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа: $trueFirstNum и $trueSecondNum")
}