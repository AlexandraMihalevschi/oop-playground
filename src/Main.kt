fun main() {
    val cappuccino = Cappuccino(Intensity.NORMAL, 50)
    cappuccino.makeCappuccino()

    val americano = Americano(Intensity.STRONG, 200)
    americano.makeAmericano()

    val pumpkinSpiceLatte = PumpkinSpiceLatte(Intensity.NORMAL, 100, 50)
    pumpkinSpiceLatte.makePumpkinSpiceLatte()

    val syrupCappuccino = SyrupCappuccino(Intensity.LIGHT, 60, SyrupType.VANILLA)
    syrupCappuccino.makeSyrupCappuccino()
}