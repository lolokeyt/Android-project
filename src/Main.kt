fun main() {
    val simulationTime = 10
    val numberOfHumans = 5

    val humans = mutableListOf<Human>()

    for (i in 0 until numberOfHumans) {
        humans.add(Human(
            fullName = "Человек $i",
            age = 20 + i,
            currentSpeed = 1.0 + i * 0.5
        ))
    }

    for (time in 0 until simulationTime) {
        println("Time: ${time}s")
        for (human in humans) {
            human.move()
            println("Human ${human.getFullName()}: (${"%.2f".format(human.getX())}, ${"%.2f".format(human.getY())})")
        }
        println("---")
    }
}