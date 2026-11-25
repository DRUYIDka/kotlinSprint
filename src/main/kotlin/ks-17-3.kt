class Folder(
    val nameInitial: String,
    var countFileReal: Int,
    val isStatusFile: Boolean,
) {

    val name: String
        get() {
            return if(isStatusFile) {
                "скрытая папка"
            } else{
                nameInitial
            }
        }
    val countFile: Int
        get() {
            return if(isStatusFile) {
                0
            } else{
                countFileReal
            }
        }

}

fun main() {
    val folder = Folder("Загрузки", 5, false)
    println(folder.name)
    println("Количество файлов: ${folder.countFileReal}")
}