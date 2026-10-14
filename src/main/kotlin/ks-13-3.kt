class DirectoryEntryContacts(val userName: String, val phoneNumber: Long, val company: String? = null)

fun main() {
    val listContacts: List<DirectoryEntryContacts> = listOf(DirectoryEntryContacts("Анна", 79795678789L),
        DirectoryEntryContacts("Серёжа", 79795678345L, null),
        DirectoryEntryContacts("Маша", 79795676523L),
        DirectoryEntryContacts("Ира", 79795987456L, "Компания"),
        DirectoryEntryContacts("Люба", 79795674323L, "Реддит"),
    )
    val companyInContacts = listContacts.map { it.company }
    companyInContacts.forEach { company ->
        if(company != null) println(company)
    }
}

