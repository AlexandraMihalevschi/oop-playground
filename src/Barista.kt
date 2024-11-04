import java.util.*

class Barista {

    private val menu = listOf("Cappuccino", "Americano", "PumpkinSpiceLatte", "SyrupCappuccino")
    private val scanner = Scanner(System.`in`)

    fun showMenu() {
        println("Welcome to the FAF Coffee Shop! Here’s our menu:")
        menu.forEachIndexed { index, coffee ->
            println("${index + 1}. $coffee")
        }
        println("\nPlease enter the numbers of the coffees you'd like to order, one at a time.")
        println("Write 'done' when you’re finished.\n")
    }

    fun takeOrder(): List<Pair<String, Map<String, Any>>> {
        val orderList = mutableListOf<Pair<String, Map<String, Any>>>()

        while (true) {
            val input = scanner.nextLine()
            if (input.lowercase() == "done") break

            val coffeeType = menu.getOrNull(input.toInt() - 1)
            if (coffeeType != null) {
                val coffeeDetails = gatherCoffeeDetails(coffeeType)
                orderList.add(coffeeType to coffeeDetails)
                println("$coffeeType added to your order with details $coffeeDetails.")
            } else {
                println("Invalid selection.")
            }
        }

        return orderList
    }

    private fun gatherCoffeeDetails(coffeeType: String): Map<String, Any> {
        val details = mutableMapOf<String, Any>()

        when (coffeeType) {
            "Americano" -> {
                details["intensity"] = askIntensity()
                details["mlOfWater"] = askVolume("water")
            }
            "Cappuccino" -> {
                details["intensity"] = askIntensity()
                details["mlOfMilk"] = askVolume("milk")
            }
            "PumpkinSpiceLatte" -> {
                details["intensity"] = askIntensity()
                details["mlOfMilk"] = askVolume("milk")
                details["mgOfPumpkinSpice"] = askVolume("pumpkin spice", unit = "mg")
            }
            "SyrupCappuccino" -> {
                details["intensity"] = askIntensity()
                details["mlOfMilk"] = askVolume("milk")
                details["syrup"] = askSyrupType()
            }
        }

        return details
    }

    private fun askIntensity(): Intensity {
        println("Please choose intensity: 1 for LIGHT, 2 for NORMAL, 3 for STRONG")
        return when (scanner.nextLine().toIntOrNull()) {
            1 -> Intensity.LIGHT
            2 -> Intensity.NORMAL
            3 -> Intensity.STRONG
            else -> Intensity.NORMAL // Normal as default
        }
    }

    private fun askVolume(type: String, unit: String = "ml"): Int {
        println("Enter the amount of $type in $unit:")
        return scanner.nextLine().toIntOrNull() ?: 100 // 100 as default
    }

    private fun askSyrupType(): SyrupType {
        println("Choose a syrup type: 1 for MACADAMIA, 2 for VANILLA, 3 for COCONUT, 4 for CARAMEL, 5 for CHOCOLATE, 6 for POPCORN")
        return when (scanner.nextLine().toIntOrNull()) {
            1 -> SyrupType.MACADAMIA
            2 -> SyrupType.VANILLA
            3 -> SyrupType.COCONUT
            4 -> SyrupType.CARAMEL
            5 -> SyrupType.CHOCOLATE
            6 -> SyrupType.POPCORN
            else -> SyrupType.VANILLA // Default to vanilla
        }
    }

    fun prepareAndServe(orderList: List<Pair<String, Map<String, Any>>>) {
        println("\nPreparing 😺🎵🍵...")
        orderList.forEach { (coffeeType, details) ->
            when (coffeeType) {
                "Cappuccino" -> {
                    val cappuccino = Cappuccino(details["intensity"] as Intensity, details["mlOfMilk"] as Int)
                    cappuccino.printDetails()
                    cappuccino.makeCappuccino()
                }
                "Americano" -> {
                    val americano = Americano(details["intensity"] as Intensity, details["mlOfWater"] as Int)
                    americano.printDetails()
                    americano.makeAmericano()
                }
                "PumpkinSpiceLatte" -> {
                    val pumpkinSpiceLatte = PumpkinSpiceLatte(
                        details["intensity"] as Intensity,
                        details["mlOfMilk"] as Int,
                        details["mgOfPumpkinSpice"] as Int
                    )
                    pumpkinSpiceLatte.printDetails()
                    pumpkinSpiceLatte.makePumpkinSpiceLatte()
                }
                "SyrupCappuccino" -> {
                    val syrupCappuccino = SyrupCappuccino(
                        details["intensity"] as Intensity,
                        details["mlOfMilk"] as Int,
                        details["syrup"] as SyrupType
                    )
                    syrupCappuccino.printDetails()
                    syrupCappuccino.makeSyrupCappuccino()
                }
                else -> println("A turn off coffee 🤧: $coffeeType")
            }
        }
        println("\nYour order is ready! Enjoy!")
    }
}

