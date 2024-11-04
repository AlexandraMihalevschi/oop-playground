open class Americano(
    coffeeIntensity: Intensity,
    val mlOfWater: Int,
    name: String = "Americano"
) : Coffee(coffeeIntensity, name) {

    override fun printDetails() {
        super.printDetails()
        println("Americano water: $mlOfWater ml")
    }

    // Method specific to making Americano
    fun makeAmericano(): Americano {
        val reset = "\u001b[0m"
        val americano = "\u001b[38;2;100;52;26m"       // Dark brown, like an Americano
        println(americano + "Making Americano")
        println("Intensity set to $coffeeIntensity")
        println("Adding $mlOfWater ml of water" + reset)
        return this
    }
}