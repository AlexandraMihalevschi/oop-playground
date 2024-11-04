fun main() {
    val cappuccino = Cappuccino(Intensity.NORMAL, 50)
    cappuccino.printDetails()

    val americano = Americano(Intensity.STRONG, 200)
    americano.printDetails()

    val pumpkinSpiceLatte = PumpkinSpiceLatte(Intensity.NORMAL, 50, 30)
    pumpkinSpiceLatte.printDetails()

    val syrupCappuccino = SyrupCappuccino(Intensity.LIGHT, 60, SyrupType.VANILLA)
    syrupCappuccino.printDetails()
}