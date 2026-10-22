class ContactDirectoryEntry(val userName: String, val phoneNumber: Long, val company: String? = null) {
}

fun main() {
    val userNameInput = readln()
    val inputPhoneNumber = readln()
    val inputCompany = readln()

    try {
        ContactDirectoryEntry(userNameInput, inputPhoneNumber.toLong(), inputCompany)
    } catch(e: NumberFormatException){
        println(e::class.simpleName)
    }
}