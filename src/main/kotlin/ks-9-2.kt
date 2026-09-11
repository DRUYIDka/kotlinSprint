fun main() {
    val recipe = mutableListOf("яйца", "сыр", "майонез")
    val newIngredient: String

    println("В рецепте есть базовые ингредиенты: $recipe")
    println("Желаете добавить еще?")
    val answerOnQuestion = readln()
    if (answerOnQuestion.equals("да")) {
        newIngredient = readln()
        recipe.add(newIngredient)
    } else {
        return
    }
    println("Теперь в рецепте есть следующие ингредиенты: $recipe")


}