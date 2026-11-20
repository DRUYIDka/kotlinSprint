private const val PI = 3.14

class Circle(initialisationRadius: Double) {
    var radius: Double = initialisationRadius
        private set

    fun circumference() {
        println("Длина окружности = ${2 * PI * radius}")
    }

    fun areaCircle() {
        println("Периметр окружности = ${PI * radius * radius}")
    }
}

fun main() {
    val circle = Circle(10.0)
    circle.circumference()
    circle.areaCircle()
}