open class Cappuccino(
    coffeeIntensity: Intensity,
    val mlOfMilk: Int,
    name: String = "Cappuccino"
) : Coffee(coffeeIntensity, name)