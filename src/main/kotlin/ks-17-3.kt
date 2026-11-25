class Folder(
   private val nameInitial: String,
   private var countFileReal: Int,
    val isStatusFile: Boolean,
) {

    val name: String
        get() = if(isStatusFile) "скрытая папка" else nameInitial

    val countFile: Int
        get() = if(isStatusFile) 0 else countFileReal
}

fun main() {
    val folder = Folder("Загрузки", 5, true)
    println(folder.name)
    println("Количество файлов: ${folder.countFile}")
    val folder2 = Folder("Рабочий стол", 3, false)
    println(folder2.name)
    println("Количество файлов: ${folder2.countFile}")
}