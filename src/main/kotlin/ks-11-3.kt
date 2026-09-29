class Room(
    val cover: String,
    val name: String,

) {

    var listUsersRoom: MutableList<Any> = mutableListOf()
    val statusList: List<String> = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    var user = Users("", "", "")

    fun newMember() {
        if (statusList.contains(user.status)) {
            listUsersRoom.add(user)
        } else {
            println("Такого статуса не существует!")
        }

    }

    fun statusUpdate() {
        var newStatus = ""
        println("Текущий статус участника - ${user.status}, какой новый статус участника?")
        newStatus = readln()
        user.status = newStatus


    }
}

class Users(
    var avatar: String,
    var name: String,
    var status: String,

)

fun main() {
    val newRoom = Room(
        cover = "Розовый фон",
        name = "Девочки такие девочки",

    )
    newRoom.user = Users("аватарка", "Анна", "разговаривает")

    newRoom.newMember()
    newRoom.statusUpdate()
    println(newRoom.cover)
    println(newRoom.name)
    println(newRoom.listUsersRoom)

}