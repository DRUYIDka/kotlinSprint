fun main() {
    val ingredients = listOf("колбаса", "сыр", "помидор", "хлеб")
    println("В рецепте есть следующие ингредиенты:")

    ingredients.forEach {
        println("$it")
    }
}