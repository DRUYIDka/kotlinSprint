class PhoneDirectoryEntry(
    val userName: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val user1 = PhoneDirectoryEntry("Анна", 79999999999L, "COMPANY")
    val user2 = PhoneDirectoryEntry("Сергей", 79999999998L, null)

    println(user1.userName)
    println(user1.phoneNumber)
    println(user1.company ?: "компания не указана")

    println(user2.userName)
    println(user2.phoneNumber)
    println(user2.company ?: "компания не указана")
}