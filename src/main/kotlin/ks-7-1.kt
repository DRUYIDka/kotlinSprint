import kotlin.random.Random

fun main() {
    val char = "abcdefghigklmnopqrstuvwxyz0123456789"
    var password = ""

    for(i in 1..6){
        password += char[Random.nextInt(char.length)]
    }
    println(password)
}