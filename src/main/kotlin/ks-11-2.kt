class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)
class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun outputAbutUser() {
        println("Вывод информации о пользователе:")
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun inputBio() {
        println("Введите информацию о себе")
        val infoBio = readln()
        bio = infoBio
    }

    fun newPassword() {
        println("Введите старый пароль")
        var inputPassword = readln()
        if(inputPassword == password){
            println("Введите новый пароль")
            inputPassword = readln()
            password = inputPassword
            println("Пароль изменён!")
        }
    }
}

fun main() {
    val user1 = User2(
        id = 1,
        login = "user1",
        password = "123Ab",
        email = "exaple@example.ru",
    )
    user1.inputBio()
    user1.newPassword()
    user1.outputAbutUser()


}