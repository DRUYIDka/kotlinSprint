fun main() {
    val ingredients = listOf("колбаса", "сыр", "помидор", "хлеб")
    println("В рецепте есть следующие ингредиенты: [список_ингредиентов]")

    ingredients.forEach {
        println("$it")
    }
}