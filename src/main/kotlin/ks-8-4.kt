fun main() {
    val ingredientsList = arrayOf("бананы", "яблоки", "апельсины", "сметана", "сахар")
    println(ingredientsList.joinToString(", "))
    println("Какой ингредиент вы хотите заменить?")
    val ingredient = readln()


    if (ingredient !in ingredientsList) {
        println("Данного ингредиента нет в списке")
    } else {
        println("На какой ингредиент хотите заменить?")
        val newIngredient = readln()
        ingredientsList.set(ingredientsList.indexOf(ingredient), newIngredient)
    }
    println("Готово! Вы сохранили следующий список: ${ingredientsList.joinToString(", ")}")
}