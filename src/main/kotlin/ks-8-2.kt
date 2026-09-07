fun main() {
    val recipes = arrayOf("зелень", "петрушка", "колбаса", "сыр")
    println("Введите ингредиент для поиска")
    val ingredient = readln()

    for (i in recipes) {
        if (i == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    if (ingredient !in recipes){
        println("Такого ингредиента в рецепте нет")
    }
}


