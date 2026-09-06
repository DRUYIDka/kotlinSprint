import kotlin.random.Random

fun main() {
    val char = "abcdefghijklmnopqrstuvwxyz"
    val num = "0123456789"
    var password = ""

    for(i in 1..3) {
        password += char[Random.nextInt(char.length)]
        password += num[Random.nextInt(num.length)]
    }
    println(password)
}