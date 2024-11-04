open class SyrupCappuccino(
    coffeeIntensity: Intensity,
    mlOfMilk: Int,
    val syrup: SyrupType,
    name: String = "SyrupCappuccino"
) : Cappuccino(coffeeIntensity, mlOfMilk, name) {
    // Override printDetails to include syrup details
    override fun printDetails() {
        super.printDetails() // Call the parent method
        println("Syrup Cappuccino syrup: $syrup")
    }
}