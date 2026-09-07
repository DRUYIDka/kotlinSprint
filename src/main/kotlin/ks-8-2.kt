fun main() {
    val recipes = arrayOf("зелень", "петрушка", "колбаса", "сыр")
    println("Введите ингрудиент для поиска")
    val ingredient = readln()

    for (i in recipes) {
        if (i == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
            break
        }
    }
}