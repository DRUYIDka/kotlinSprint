class ContactDirectoryEntry(val userName: String, val phoneNumber: Long?, val company: String? = null) {
    fun printContact() {
        println("Имя: $userName")
        println("Номер телефона: $phoneNumber")
        println("Компания: ${company ?: "не указана"}")

    }
}

fun main() {
    val listContacts: MutableList<ContactDirectoryEntry> = mutableListOf()
    println("Введите количество пользователей для телефонной книги")
    var countUser = readln().toIntOrNull() ?: run {
        println("Вы ввели неверное количество пользователей должно быть числом больше 0 ")
        return
    }
    while (countUser > 0) {
        println("Введите имя: ")
        val userNameInput = readln()
        println("Введите номер телефона: ")
        val phoneNumberInput = readln().toLongOrNull()
        println("Введите название компании: ")
        val companyInput = readln().takeIf { it.isNotEmpty() }

        val contact = ContactDirectoryEntry(userNameInput, phoneNumberInput, companyInput)
        if (contact.phoneNumber == null) {
            println("Номер телефона не указан")
        } else {
            listContacts.add(contact)
        }
        countUser--
    }

    listContacts.forEach { it.printContact() }
}