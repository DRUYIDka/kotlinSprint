fun main() {
    var whereFrom: String = "E2"
    var where: String = "E4"
    var numPart: Int = 1

    println("${whereFrom.lowercase()}-${where.lowercase()};$numPart")

    whereFrom = "D2"
    where = "D3"
    numPart = 2

    println("${whereFrom.lowercase()}-${where.lowercase()};$numPart")
}