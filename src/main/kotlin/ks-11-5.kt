class Forum(
) {

    private val allUsers: MutableList<ForumUser> = mutableListOf()
    private var count: Int = 1
    private val messageNew: MutableList<ForumMessage> = mutableListOf()

    class ForumUser private constructor(val userId: Int, val userName: String) {
        companion object {
            fun userElement(userId: Int, userName: String) = ForumUser(userId, userName)
        }
    }

    class ForumMessage private constructor(val authorId: Int, val message: String) {
        companion object {
            fun elementMessage(authorId: Int, message: String) = ForumMessage(authorId, message)
        }
    }


    fun createNewUser(name: String): ForumUser {
        val id = count
        val newUser = ForumUser.userElement(id, name)
        allUsers.add(newUser)
        count++

        return newUser
    }

    fun createNewMessage(id: Int, message: String): ForumMessage? {
        var elementMessage: ForumMessage? = null
        val messageAll = allUsers.find { it.userId == id }
        if (messageAll != null) {
            elementMessage = ForumMessage.elementMessage(id, message)
            messageNew.add(elementMessage)

        }
        return elementMessage
    }

    fun printThread() {
        messageNew.forEach { element ->
            val infoUser = allUsers.find { it.userId == element.authorId }
            println("${infoUser?.userName ?: "автор не найден"}: ${element.message}")

        }
    }

}


fun main() {
    val forum = Forum()
    forum.createNewUser("Серёжа")
    forum.createNewMessage(1, "привет")
    forum.createNewMessage(1, "как дела")
    forum.createNewUser("Анна")
    forum.createNewMessage(2, "приветик")
    forum.createNewMessage(2, "всё хорошо")
    forum.printThread()

}