abstract class User() {
    abstract val name: String
    open fun write() = "$name написал сообщение"
    open fun read() = "$name читает сообщения"
}

class Administrator(override val name: String) : User() {
    fun deleteUser() = "$name удалил ползователя"
    fun deleteMessage() = "$name удалил сообщение"

}

class StandardUser(override val name: String) : User()

fun main() {
    val admin = Administrator("Admin")
    println(admin.write())
    println(admin.read())
    println(admin.deleteMessage())
    println(admin.deleteUser())

    val user = StandardUser("Standard user")
    println(user.write())
    println(user.read())
}