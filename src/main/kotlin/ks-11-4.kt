class Categoria (
    val avatar: String,
    val name: String,
    val fullInfo: String,
)

class Recipe (
    val fullName: String,
    val count: Int,
    val ingredients: MutableList<Ingredient> = mutableListOf<Ingredient>(),
    val info: String,
)

class Ingredient {
    val name = ""
    val count = 0
    val sys = ""
}

enum class CalculusSys {
    ложек, Г, штуки, КГ, МГ, стаканов
}

fun main(){


}