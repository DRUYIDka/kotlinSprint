fun main() {
    val allInfoPart: String = "D2-D4;0"
    val whereFrom = allInfoPart.split("-",";")[0]
    val where = allInfoPart.split("-",";")[1]
    val numPart = allInfoPart.split("-",";")[2]

    println(whereFrom)
    println(where)
    println(numPart)
}