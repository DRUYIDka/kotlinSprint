fun main() {
    val recipes = arrayOf("зелень", "петрушка", "колбаса", "сыр")
    println("Какой ингредидиент вы хотите найти?")
    val ingredient = readln()

    if (ingredient in recipes) {
        println("Этот ингредиент в рецепте есть")
    } else
        println("Такого ингредиента в рецепте нет")

}


