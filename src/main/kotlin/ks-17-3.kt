class Folder(
    val name: String,
    var countFile: Int,
    val isStatusFile: Boolean,
) {
    var isSecretFolder: Boolean = isStatusFile
        get() {
            if (field) {
                println("скрытая папка")
                countFile = 0
                println("Количество файлов: ${countFile}")
                return true
            } else {
                println("Имя папки: ${name}")
                println("Количество файлов: ${countFile}")
                return false
            }
        }
}

fun main() {
    val folder = Folder("Загрузки", 5, true)
    folder.isSecretFolder
}