fun main() {
    val recipeCount = mutableListOf(2, 50, 15)
    println("Сколько порций вы хотите приготовить?")
    val countServings = readln().toInt()
    val servingRecipeCount = recipeCount.map {
        it * countServings
    }
    println("На $countServings порций вам понадобится: Яиц – ${servingRecipeCount[0]}, молока – ${servingRecipeCount[1]}, сливочного масла – ${servingRecipeCount[2]}")

}