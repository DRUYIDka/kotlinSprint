fun main() {
    println("Введите число ингредиентов")
    val sizeArray = readln().toInt()
    val inputIngredients = Array(sizeArray) {readln()}

    println(inputIngredients.joinToString(", "))
}
