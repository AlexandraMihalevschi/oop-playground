open class SyrupCappuccino(
    coffeeIntensity: Intensity,
    mlOfMilk: Int,
    val syrup: SyrupType,
    name: String = "SyrupCappuccino"
) : Cappuccino(coffeeIntensity, mlOfMilk, name)