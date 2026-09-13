fun main() {
    var ingredients: String
    val listIngredients: MutableList<String> = mutableListOf()

    for (i in 1..5) {
        ingredients = readln()
        listIngredients.add(ingredients)
    }
    val sortList = listIngredients.sorted()
    println(sortList.distinct().joinToString(", ").replaceFirstChar { it.uppercase() })
}