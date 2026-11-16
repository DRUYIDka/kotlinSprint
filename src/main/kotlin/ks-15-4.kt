abstract class Instrument(val name: String, val count: Int)
class Components(name: String, count: Int) : Instrument(name, count), Search {
    override fun searchComponents() = println("Выполняется поиск")
}

interface Search {
    fun searchComponents()
}
fun main() {
    val instrument = Components("гитара", 4)
    instrument.searchComponents()
}