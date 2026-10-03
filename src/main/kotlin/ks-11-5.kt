class Forum constructor(

) {
    val allUsers: MutableList<ForumUser> = mutableListOf()
    var count: Int = 1
    val messageNew: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String): ForumUser {
        val id = count
        val newUser = ForumUser(id, name)
        allUsers.add(newUser)
        count++

        return newUser
    }

    fun createNewMessage(id: Int?, message: String): String {

        val messageAll = allUsers.find { it.userId == id }
        if (messageAll != null) {
            val newMessage = ForumMessage(id, message)
            messageNew.add(newMessage)

        }
        return messageNew.toString()
    }

    fun printThread() {
        messageNew.forEach { element ->
            allUsers.forEach {
                it
                if(it.userId == element.authorId) {
                    print("${it.userName}: ${element.message} ")
                }
            }
        }

    }
}


class ForumUser(val userId: Int?, val userName: String)
class ForumMessage(val authorId: Int?, val message: String)

fun main() {
    val forum = Forum()
    forum.createNewUser("Серёжа")
    forum.createNewMessage(1, "привет")
    forum.createNewMessage(1, "как дела")
    forum.printThread()
}