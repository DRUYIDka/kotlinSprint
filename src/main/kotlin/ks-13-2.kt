class DirectoryEntry(val userName: String, val phoneNumber: Long) {
    val company: String? = null

    fun printInfoContact() {
        println("$userName $phoneNumber ${company ?: "не указано"}")
    }
}

fun main() {
    val user1 = DirectoryEntry("Anya", 79795678789L)
    user1.printInfoContact()
}
