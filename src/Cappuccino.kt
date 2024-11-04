internal open class Cappuccino(
    coffeeIntensity: Intensity,
    val mlOfMilk: Int,
    name: String = "Cappuccino"
) : Coffee(coffeeIntensity, name) {

    override fun printDetails() {
        super.printDetails()
        println("Cappuccino milk: $mlOfMilk ml")
    }

    // Method specific to making Cappuccino
    fun makeCappuccino(): Cappuccino {
        val reset = "\u001b[0m"
        val cappuccino = "\u001b[38;2;181;101;29m"    // Warm, light brown, like Cappuccino foam))
        println(cappuccino + "Making Cappuccino")
        println("Intensity set to $coffeeIntensity")
        println("Adding $mlOfMilk ml of milk" + reset)
        return this
    }
}