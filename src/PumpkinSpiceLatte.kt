open class PumpkinSpiceLatte(
    coffeeIntensity: Intensity,
    mlOfMilk: Int,
    val mgOfPumpkinSpice: Int,
    name: String = "PumpkinSpiceLatte"
) : Cappuccino(coffeeIntensity, mlOfMilk, name) {
    // Override printDetails to include pumpkin spice details
    override fun printDetails() {
        super.printDetails() // Call the parent method
        println("Pumpkin Spice Latte pumpkin spice: $mgOfPumpkinSpice mg")
    }
}