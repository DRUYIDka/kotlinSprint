class Ship(
    initialName: String,
    val averageSpeed: Int,
    val homePort: String,
){
    var name: String = initialName
        set(value) {
            if (value != field) println("Имя нельзя менять!")
        }

}
fun main(){
    val ship = Ship("Аврора", 4545, "1")
    ship.name = "Алые паруса"
    println(ship.name)
}