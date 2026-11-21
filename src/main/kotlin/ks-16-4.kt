class Order(number: Int) {
    var isOrdered: Boolean = false
        private set

    internal fun confirm(statusNew: Boolean) {
        isOrdered = statusNew
    }

}

fun changeStatus(order: Order, statusNew: Boolean) {
    order.confirm(statusNew)
}

fun main() {
    val numberOrder = 15
    val order = Order(numberOrder)
    changeStatus(order, true)
    println(order.isOrdered)

}