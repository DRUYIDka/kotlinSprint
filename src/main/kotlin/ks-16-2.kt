private const val PI = 3.14

class Circle(initialisationRadius: Double) {
    private val radius: Double = initialisationRadius


    fun circumference() {
        println("Длина окружности = ${2 * PI * radius}")
    }

    fun areaCircle() {
        println("Площадь окружности = ${PI * radius * radius}")
    }
}

fun main() {
    val circle = Circle(10.0)
    circle.circumference()
    circle.areaCircle()
}