open class Coffee(
    val coffeeIntensity: Intensity,
    val name: String = "Coffee"
) {
    // Method to print coffee details
    open fun printDetails() {
        println("Coffee intensity: $coffeeIntensity")
    }
}