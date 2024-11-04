open class PumpkinSpiceLatte(
    coffeeIntensity: Intensity,
    mlOfMilk: Int,
    val mgOfPumpkinSpice: Int,
    name: String = "PumpkinSpiceLatte"
) : Cappuccino(coffeeIntensity, mlOfMilk, name) {

    override fun printDetails() {
        super.printDetails()
        println("Pumpkin Spice Latte pumpkin spice: $mgOfPumpkinSpice mg")
    }

    // Method specific to making Pumpkin Spice Latte
    fun makePumpkinSpiceLatte(): PumpkinSpiceLatte {
        val reset = "\u001b[0m"
        val pumpkinSpiceLatte = "\u001b[38;2;255;165;0m" // Rich orange-brown, like a Pumpkin Spice Latte
        println(pumpkinSpiceLatte + "Making Pumpkin Spice Latte")
        println("Intensity set to $coffeeIntensity")
        println("Adding $mlOfMilk ml of milk")
        println("Adding $mgOfPumpkinSpice mg of pumpkin spice" + reset)
        return this
    }
}