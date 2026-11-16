abstract class Category(val name: String, val count: Int)
class Instrument(name: String, count: Int) : Category(name, count), Search {
    override fun searchComponents() = println("Выполняется поиск")
}
class Components(name: String, count: Int) : Category(name, count)

interface Search {
    fun searchComponents()
}

fun main() {
    val instrument = Instrument("гитара", 4)
    instrument.searchComponents()
}