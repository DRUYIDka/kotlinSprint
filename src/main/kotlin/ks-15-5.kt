interface Drivable {
    val maxSpeed: Int
    fun drive() {
        println("Едет со скоростью $maxSpeed")
    }
}

interface PeopleTransported {
    val countPeopleMax: Int
    var amountPeopleNow: Int
    fun loadPassenger(amount: Int) {
        if (0 <= amount) {
            val freePassenger = countPeopleMax - amountPeopleNow
            if (amount <= freePassenger) {
                amountPeopleNow += amount
            } else {
                amountPeopleNow += freePassenger
                println("Не хватает ${amount - freePassenger} человек")
            }
        } else {
            println("Количество отрицательно! Введите повторно")
            return
        }
    }

    fun unloadPassenger(amount: Int) {
        if (0 <= amount) {
            if (amountPeopleNow >= amount) {
                amountPeopleNow -= amount
                println("Выгружено ${amount} человек")
            } else {
                println("На борту ${amountPeopleNow} просят ${amount}")
            }
        } else {
            println("Количество отрицательно! Введите повторно")
            return
        }
    }
}

interface TransportsCargo {
    val countCargoMax: Int
    var amountCargoNow: Int
    fun loadCargo(amount: Int) {
        if (0 <= amount) {
            val freeCargo = countCargoMax - amountCargoNow
            if (amount <= freeCargo) {
                amountCargoNow += amount
            } else {
                amountCargoNow += freeCargo
                println("Не хватает ${amount - freeCargo} тонн груза")
            }
        } else {
            println("Количество отрицательно! Введите повторно")
            return
        }
    }

    fun unloadCargo(amount: Int) {
        if (0 <= amount) {
            if (amountCargoNow >= amount) {
                amountCargoNow -= amount
                println("Выгружено ${amount} тонны")
            } else {
                println("На борту ${amountCargoNow} просят ${amount}")
            }
        } else {
            println("Количество отрицательно! Введите повторно")
            return
        }
    }
}

class Truck(
    override val countPeopleMax: Int = 1,
    override var amountPeopleNow: Int = 0,
    override val countCargoMax: Int = 2,
    override var amountCargoNow: Int = 0, override val maxSpeed: Int = 60
) : Drivable, PeopleTransported, TransportsCargo {
    override fun drive() {
        println("Грузовик перевозит $countCargoMax тонн груза со скоростью ${maxSpeed}")
    }
}

class Passenger(
    override val countPeopleMax: Int = 3,
    override var amountPeopleNow: Int = 0, override val maxSpeed: Int = 90
) : Drivable, PeopleTransported {

}

fun main() {
    val truck = Truck()
    val passenger = Passenger()
    truck.loadPassenger(1)
    truck.unloadPassenger(1)
    truck.drive()
    truck.loadCargo(2)
    passenger.drive()
    truck.unloadCargo(2)

    passenger.loadPassenger(3)
    passenger.unloadPassenger(3)
    passenger.loadPassenger(2)
    passenger.unloadPassenger(2)

}
