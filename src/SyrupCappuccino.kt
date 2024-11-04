open class SyrupCappuccino(
    coffeeIntensity: Intensity,
    mlOfMilk: Int,
    val syrup: SyrupType,
    name: String = "SyrupCappuccino"
) : Cappuccino(coffeeIntensity, mlOfMilk, name) {

    override fun printDetails() {
        super.printDetails()
        println("Syrup Cappuccino syrup: $syrup")
    }

    // Method specific to making Syrup Cappuccino
    fun makeSyrupCappuccino(): SyrupCappuccino {
        val reset = "\u001b[0m"
        val syrupCappuccino = "\u001b[38;2;194;144;84m" // Medium brown, syrupy Cappuccino
        println(syrupCappuccino + "Making Syrup Cappuccino")
        println("Intensity set to $coffeeIntensity")
        println("Adding $mlOfMilk ml of milk")
        println("Adding syrup: $syrup" + reset)
        return this
    }
}
