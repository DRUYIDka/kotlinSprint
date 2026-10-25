import kotlin.random.Random

const val CHARS = "123456789abcdef"
private fun generationId(): String {
    var id: String = ""
    repeat(4) {
        id += CHARS[Random.nextInt(CHARS.length)]
    }
    return id
}

class Chat(val messages: MutableList<Message>) {
    fun addMessage(message: String, author: String): String {
        val id = generationId()
        val newMessage = Message(message, id, author)
        messages.add(newMessage)
        return id
    }

    fun addThreadMessage(parentMessageId: String, message: String, author: String) {
        val idChild = generationId()
        val newMessage = ChildMessage(message, idChild, parentMessageId, author)
        messages.add(newMessage)
    }

    fun printChat() {
        val messagesAll = messages.groupBy {it ->
            if (it is Message) {
                println(it.id + " " + it.author + " " + it.text)
            }
        }
    }
}

open class Message(val text: String, val id: String = generationId(), val author: String)

class ChildMessage(message: String, idChild: String = generationId(), val parentMessageId: String, author: String) :
    Message(message, idChild, author)


fun main() {
    val message = mutableListOf<Message>()
    val chat = Chat(message)
    val id = chat.addMessage("Привет", "Анна")
    chat.addThreadMessage(id, "Привет", "Серёжа")
    chat.printChat()
}