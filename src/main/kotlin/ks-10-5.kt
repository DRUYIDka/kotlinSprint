const val VALID_LOGIN = "user"
const val VALID_PASSWORD = "123456"

fun main() {
    val loginInput = VALID_LOGIN
    val passwordInput = VALID_PASSWORD
    if (getToken(loginInput, passwordInput) != null) {
        println("Корзина:\n${getBasket(getToken(loginInput, passwordInput)).joinToString("\n")}")
    } else println("Неверный логин или пароль!")
}

fun getBasket(token: String?): List<String> {
    val listShopping = listOf("футболка", "шорты", "худи")
    return listShopping
}

fun getToken(login : String, password : String) : String? {

    val fullLine = ('a'..'z') + ('0'..'9')
    val token: String?
    val isTrueCredentials = ((login == VALID_LOGIN) && (password == VALID_PASSWORD))

    if (isTrueCredentials) {
        token = (1..32).map { fullLine.random() }.joinToString("")
    } else token = null

    return token
}