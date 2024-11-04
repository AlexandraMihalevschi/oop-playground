open class Coffee(
    val coffeeIntensity: Intensity,
    val name: String = "Coffee"
) {
    open fun printDetails() {
        println("Coffee intensity: $coffeeIntensity")
    }

    // Base method for making coffee
    open fun makeCoffee(): Coffee {
        println("Making $name")
        println("Intensity set to $coffeeIntensity")
        return this
    }
}