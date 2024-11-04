fun main() {
    val barista = Barista()
    barista.showMenu()
    val orderList = barista.takeOrder()
    barista.prepareAndServe(orderList)
}
