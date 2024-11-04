open class PumpkinSpiceLatte(
    coffeeIntensity: Intensity,
    mlOfMilk: Int,
    val mgOfPumpkinSpice: Int,
    name: String = "PumpkinSpiceLatte"
) : Cappuccino(coffeeIntensity, mlOfMilk, name)