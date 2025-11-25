fun main() {
    val simulationTime = 10


    val humans = listOf(
        Human("Иван Иванов", 25, 1.5),
        Human("Петр Петров", 30, 2.0),
        Human("Анна Сидорова", 28, 1.8)
    )

    val driver = Driver("Алексей Козлов", 35, 3.0, "автомобиль")

    val allMovable = humans + driver

    println("=== Начало параллельной симуляции ===")


    for (time in 0 until simulationTime) {
        println("\n--- Секунда $time ---")

        val threads = mutableListOf<Thread>()
        for (movable in allMovable) {
            val thread = Thread {
                movable.move()
            }
            threads.add(thread)
            thread.start()
        }


        threads.forEach { it.join() }
    }

    println("\n=== Финальные позиции ===")
    allMovable.forEach {
        println("${it.getFullName()}: (${"%.2f".format(it.getX())}, ${"%.2f".format(it.getY())})")
    }
}