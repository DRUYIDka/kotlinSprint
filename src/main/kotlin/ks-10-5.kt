const val VALID_LOGIN = "user"
const val VALID_PASSWORD = "123456"

fun main() {
    println("Введите логин")
    val loginInput = readln()
    println("Введите пароль")
    val passwordInput = readln()
    val fullLine = ('a'..'z') + ('0'..'9')
    val token: String?
    val isTrueCredentials = ((loginInput == VALID_LOGIN) && (passwordInput == VALID_PASSWORD))

    if (isTrueCredentials) {
        token = (1..32).map { fullLine.random() }.joinToString("")

    } else token = null

    getBasket(token)
}

fun getBasket(token: String?) {
    val listShopping = mutableListOf("футболка", "шорты", "худи")

    if (token != null) {
        println("Корзина:\n ${listShopping.joinToString("\n")}")
    } else println("Неверный логин или пароль!")
}