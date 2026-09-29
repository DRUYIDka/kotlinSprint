class Room(
    val cover: String,
    val name: String,
) {

    var listUsers: MutableList<String> = mutableListOf()
    val statusList: List<String> = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val member = Users("аватарка", "Анна", "разговаривает")
    val member2 = Users("аватарка2", "Сергей", "микрофон выключен")
    fun newMember() {
        if (statusList.contains(member.status)) {
            listUsers.add(member.toString())
        } else {
            println("Такого статуса не существует!")
        }
        if (statusList.contains(member2.status)) {
            listUsers.add(member2.toString())
        } else {
            println("Такого статуса не существует!")
        }
        println(listUsers)
    }

    fun statusUpdate() {
        var newStatus = ""
        println("Текущий статус участника - ${member.status}, какой новый статус участника?")
        newStatus = readln()
        member.status = newStatus


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

    newRoom.newMember()
    newRoom.statusUpdate()
    println(newRoom.cover)
    println(newRoom.name)


}