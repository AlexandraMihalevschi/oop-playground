open class Americano(
    coffeeIntensity: Intensity,
    val mlOfWater: Int,
    name: String = "Americano"
) : Coffee(coffeeIntensity, name)