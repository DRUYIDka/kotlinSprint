open class Ship(
    open val speed: Double = 3.2,
    open val loadCapacity: Double = 23.5,
    open val passengerCapacity: Int = 3,
) {
    open fun getInfo(): String = ""
}

class Liner : Ship() {
    override val loadCapacity = 24.0
    override val passengerCapacity = 50
    override val speed = 10.0
    override fun getInfo(): String = "Выдвигает горизонтальный трап со шкафута"
}

class Icebreaker : Ship() {
    override val passengerCapacity = 2
    override val loadCapacity = 24.0
    override val speed = 2.0
    fun stabbingIce() {
        println("Корабль может колоть лёд")
    }
    override fun getInfo(): String = "Открывает ворота со стороны кормы"

}

class CargoShip : Ship() {
    override val passengerCapacity = 2
    override val loadCapacity = 30.4
    override val speed = 2.0

    override fun getInfo(): String = "Активирует погрузочный кран"

}

fun printGetInfo(infoForShip: Ship){
    println(infoForShip.getInfo())
}

fun main() {
    val liner = Liner()
    printGetInfo(liner)
    val icebreaker = Icebreaker()
    printGetInfo(icebreaker)
    val cargoShip = CargoShip()
    printGetInfo(cargoShip)
}