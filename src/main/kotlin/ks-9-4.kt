fun main() {
    println("Введите 5  ингредиентов через запятую")
    var ingredientsCount: List<String> = readln().split(", ")
    while (ingredientsCount.size != 5) {
        println("Вы ввели ${ingredientsCount.size}, надо ввести 5 ингредиентов")
        ingredientsCount = listOf()
        ingredientsCount = readln().split(", ")
    }
    println(ingredientsCount.sorted())

}