const val WEIGHT_START = 35
const val WEIGHT_END = 100
const val VOLUME = 100

fun main() {
    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': ${20 > WEIGHT_START && 20 <= WEIGHT_END && 80 < VOLUME}\nГруз с весом 50 кг и объемом 100 л соответствует категории 'Average': ${50 > WEIGHT_START && 50 <= WEIGHT_END && 100 < VOLUME}")
}