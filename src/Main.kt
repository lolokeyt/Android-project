fun main() {
    val simulationTime = 10


    val movables: List<Movable> = listOf(
        Human("Иван Иванов", 25, 1.5),
        Human("Петр Петров", 30, 2.0),
        Human("Анна Сидорова", 28, 1.8),
        Driver("Алексей Козлов", 35, 3.0, "автомобиль")
    )

    println("=== Начало параллельной симуляции с интерфейсами ===")


    for (time in 0 until simulationTime) {
        println("\n--- Секунда $time ---")

        val threads = mutableListOf<Thread>()
        for (movable in movables) {
            val thread = Thread {
                movable.move()
            }
            threads.add(thread)
            thread.start()
        }


        threads.forEach { it.join() }
    }

    println("\n=== Финальные позиции ===")
    movables.forEach { movable ->
        val position = movable.getPosition()
        println("${movable.fullName}: (${"%.2f".format(position.first)}, ${"%.2f".format(position.second)})")
    }
}