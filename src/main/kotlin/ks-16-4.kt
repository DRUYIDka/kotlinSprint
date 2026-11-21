class Order(number: Int) {
    var numberOrder: Int = number
        private set
    var isOrdered: Boolean = false
        private set

    private fun confirm(statusNew: Boolean) {
        isOrdered = statusNew
    }
    fun changeStatus(statusNew: Boolean) {
        confirm(statusNew)
    }
}



fun main() {
    val numberOrder = 15
    val order = Order(numberOrder)
    order.changeStatus(true)
    println(order.isOrdered)

}