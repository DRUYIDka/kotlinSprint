fun main() {
    val recipes = arrayOf("зелень", "петрушка", "колбаса", "сыр")
    println("Введите ингредиент для поиска")
    val ingredient = readln()

    if (ingredient in recipes) {
        println("Ингредиент $ingredient в рецепте есть")
    } else
        println("Такого ингредиента в рецепте нет")

}


