class Room(
    val cover: String,
    val name: String,

    ) {
    var listUsersRoom = mutableListOf<User>()
    fun newMember(name: String, avatar: String, status: String) {
        listUsersRoom.add(User(avatar, name, status))
    }

    fun statusUpdate() {
        println("Статус какого пользователя вы хотите поменять")
        val searchUser = readln()
        listUsersRoom.forEach { it ->
            if(it.name == searchUser) {
                println("Текущий статус участника - ${it.status}, какой новый статус участника?")
                it.status = statuses.разговаривает.name
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

    newRoom.newMember(user.name, user.avatar, user.status)
    newRoom.newMember(user2.name, user2.avatar, user2.status)
    newRoom.statusUpdate()
    println(newRoom.cover)
    println(newRoom.name)


}