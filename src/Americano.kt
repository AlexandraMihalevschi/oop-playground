open class Americano(
    coffeeIntensity: Intensity,
    val mlOfWater: Int,
    name: String = "Americano"
) : Coffee(coffeeIntensity, name) {
    override fun printDetails() {
        super.printDetails() // Call the parent method
        println("Americano water: $mlOfWater ml")
    }
}