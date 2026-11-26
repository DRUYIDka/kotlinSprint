class User(initialLogin: String, initialPassword: String) {
    var password: String = initialPassword
        set(_) {
            println("Вы не можете изменить пароль")

        }
        get() {
            return ("*".repeat(field.length))
        }

    var login: String = initialLogin
        set(value) {
            println("Логин успешно сменён c $field на $value")
            field = value
        }
}

fun main() {
    val user = User("Anya", "43467df")
    user.password = "FDFD"
    user.login = "Serhio1"
    println(user.login)
    println(user.password)
    user.login = "Serhio2"
    println(user.login)
    println(user.password)
}