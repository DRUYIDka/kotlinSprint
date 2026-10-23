open class Ship(
    open val speed: Double = 3.2,
    open val loadCapacity: Double = 23.5,
    open val passengerCapacity: Int = 3,
)

class Liner : Ship() {
    override val loadCapacity = 24.0
    override val passengerCapacity = 50
    override val speed = 10.0
}

class Icebreaker : Ship() {
    override val passengerCapacity = 2
    override val loadCapacity = 24.0
    override val speed = 2.0
    fun stabbingIce() {
        println("Корабль может колоть лёд")
    }
}

class CargoShip : Ship() {
    override val passengerCapacity = 2
    override val loadCapacity = 30.4
    override val speed = 2.0
}

fun main() {
    val liner = Liner()
    val icebreaker = Icebreaker()
    val cargoShip = CargoShip()
}
