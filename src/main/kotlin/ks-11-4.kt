class Categoria (
    val avatar: String,
    val name: String,
    val fullInfo: String,
)

class Recipe (
    val fullName: String,
    val count: Int,
    val ingredients: List<Ingredient>,
    val info: String,
)

class Ingredient(
    val name: String,
    val count: Int,
    val unitOfMeasure: String,
)

