class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
}

fun main() {
    val user1 = User(
        id = 1,
        login = "user1",
        password = "123Ab",
        email = "exaple@example.ru",
    )

    val user2 = User(
        id = 2,
        login = "user2",
        password = "321bA",
        email = "exaple2@example.ru",
    )

    println("Данные о первом пользователе:")
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println("Данные о втором пользователе:")
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}