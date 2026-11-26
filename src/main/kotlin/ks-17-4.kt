class Package(val numPack: String, locationNow: String) {
    var countMovements: Int = 0
        private set
    var location: String = locationNow
        set(value) {
            field = value
            countMovements++
        }
}

fun main() {
    val pack = Package("6A8", "Симферополь")
    pack.location = ""
    pack.location = "Sevastopol"
    println(pack.location)
    println(pack.countMovements)
}