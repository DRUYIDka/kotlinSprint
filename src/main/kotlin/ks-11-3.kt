class Room(
    var cover: String,
    var name: String,
    var listUsers: MutableList<String> = mutableListOf(),

    ) {
    val user = Users("", "", "")
    fun newMember() {
        println("Хотите добавить нового пользователя в комнату?")
        var answerQuestion = readln()
        while (answerQuestion == "да".lowercase()) {
            println("Выберите аватар для пользователя")
            user.avatar = readln()
            println("Введите имя для пользователя")
            user.name = readln()
            println("Введите статус для пользователя")
            user.status = readln()
            listUsers.add(user.name)
            println("Хотите добавить нового пользователя в комнату?")
            answerQuestion = readln()
        }
        println(listUsers)
    }

    fun statusUpdate() {
        println("Статус какого участника вы хотите сменить?")
        var newStatus = ""
        val answer = readln()
        for (i in listUsers) {
            if (i == answer) {
                println("Текущий статус участника - ${user.status}, какой новый статус участника?")
                newStatus = readln()
                user.status = newStatus

            }

        }
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