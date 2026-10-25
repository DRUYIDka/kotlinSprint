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

    fun addThreadMessage(message: String, author: String, parentMessageId: String) {
        val idChild = generationId()
        val newMessage = ChildMessage(message, idChild, parentMessageId, author)
        messages.add(newMessage)
    }

    fun printChat() {
        val groups = messages.groupBy { msg ->
            if (msg is ChildMessage) {
                msg.parentMessageId
            } else {
                msg.id
            }
        }

        for ((_, group) in groups) {
            for (msg in group) {
                if(msg is ChildMessage) {
                    println("\t" + msg.id + " " + msg.author + " " + msg.text)
                } else {
                    println(msg.id + " " + msg.author + " " + msg.text)
                }
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
    chat.addThreadMessage("Привет", "Серёжа", id)
    chat.printChat()
}