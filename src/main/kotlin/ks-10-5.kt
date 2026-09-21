const val VALID_LOGIN = "user"
const val VALID_PASSWORD = "123456"

fun main() {
    println("Логин")
    val loginInput = VALID_LOGIN
    println("Пароль")
    val passwordInput = VALID_PASSWORD
    val fullLine = ('a'..'z') + ('0'..'9')
    val token: String?
    val isTrueCredentials = ((loginInput == VALID_LOGIN) && (passwordInput == VALID_PASSWORD))

    if (isTrueCredentials) {
        token = (1..32).map { fullLine.random() }.joinToString("")

    } else token = null

    if (token != null) {
        println("Корзина:\n ${getBasket(token).joinToString("\n")}")
    } else println("Неверный логин или пароль!")
}

fun getBasket(token: String?): List<String> {
    val listShopping = mutableListOf("футболка", "шорты", "худи")
    return listShopping
}