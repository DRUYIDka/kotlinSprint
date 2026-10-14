class DirectoryEntry(val userName: String, val phoneNumber: Long) {
    var company: String? = null

    fun printInfoContact() {
        println("Имя: $userName\nНомер: $phoneNumber\nКомпания: ${company ?: "не указано"}")
    }
}

fun main() {
    val user1 = DirectoryEntry("Anya", 79795678789L)
    user1.company = "Company"
    user1.printInfoContact()
}
