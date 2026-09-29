class Room(
    val cover: String,
    val name: String,

    ) {
    var listUsersRoom = mutableListOf<User>()
    fun newMember(user: User) {
        listUsersRoom.add(user)
    }

    fun statusUpdate(searchUser: String, statusNew: String) {
        listUsersRoom.forEach { it ->
            if(it.name == searchUser) {
                println("Текущий статус участника - ${it.status}")
                it.status = statusNew
            }
        }
    }
}

class User(
    var avatar: String,
    var name: String,
    var status: String,

    )

enum class statuses {
    разговаривает, микрофонВыключен, пользовательЗаглушен

}

fun main() {
    val newRoom = Room(
        cover = "Розовый фон",
        name = "Девочки такие девочки",
    )
    val user = User("аватарка", "Анна", statuses.разговаривает.name)
    val user2 = User("аватарка2", "Сергей", statuses.микрофонВыключен.name)

    newRoom.newMember(user)
    newRoom.newMember(user2)
    newRoom.statusUpdate("Анна", statuses.микрофонВыключен.name)
    println(newRoom.cover)
    println(newRoom.name)


}