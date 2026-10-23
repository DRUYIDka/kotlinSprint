open class Ship(
    open val speed: Double = 3.2,
    open val loadCapacity: Double = 23.5,
    open val passengerCapacity: Int = 3,
) {
    open fun getInfo(){
        println(speed)
        println(loadCapacity)
        println(passengerCapacity)
    }
    open fun shipping(): String = ""
}

class Liner : Ship() {
    override val loadCapacity = 24.0
    override val passengerCapacity = 50
    override val speed = 10.0
    override fun shipping(): String = "Выдвигает горизонтальный трап со шкафута"
}

class Icebreaker : Ship() {
    override val passengerCapacity = 2
    override val loadCapacity = 24.0
    override val speed = 2.0
    fun stabbingIce() {
        println("Корабль может колоть лёд")
    }
    override fun shipping(): String = "Открывает ворота со стороны кормы"

}

class CargoShip : Ship() {
    override val passengerCapacity = 2
    override val loadCapacity = 30.4
    override val speed = 2.0

    override fun shipping(): String = "Активирует погрузочный кран"

}

fun printGetInfo(infoForShip: Ship){
    infoForShip.getInfo()
}
fun printWayShipping(infoWay: Ship){
    infoWay.shipping()
}

fun main() {
    val liner = Liner()
    printGetInfo(liner)
    printWayShipping(liner)
    val icebreaker = Icebreaker()
    printGetInfo(icebreaker)
    printWayShipping(icebreaker)
    val cargoShip = CargoShip()
    printGetInfo(cargoShip)
    printWayShipping(cargoShip)
}