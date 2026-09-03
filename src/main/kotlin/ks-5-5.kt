import kotlin.random.Random

fun main() {
    val randomNumber = List(3) { Random.nextInt(0, 43) }
    val inputNumber = List(3) {readln().toInt()}

    val completeResult = randomNumber intersect inputNumber
    val sizeResult = completeResult.size

    when (sizeResult) {
        3 -> println("Вы угадали все числа, и выйграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа")
    }

    println("Правильные числа: $completeResult")
}