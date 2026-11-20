import kotlin.random.Random
class Cube {
    private val numberOfCube = Random.nextInt(1, 7)
    fun randomNumberPrint() {
        println(numberOfCube)
    }
}

fun main(){
    val num = Cube()
    num.randomNumberPrint()
}
















