open class Cappuccino(
    coffeeIntensity: Intensity,
    val mlOfMilk: Int,
    name: String = "Cappuccino"
) : Coffee(coffeeIntensity, name) {

    override fun printDetails() {
        super.printDetails() // Call the parent method
        println("Cappuccino milk: $mlOfMilk ml")
    }
}