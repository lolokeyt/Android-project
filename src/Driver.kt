class Driver(
    fullName: String,
    age: Int,
    currentSpeed: Double,
    private val vehicleType: String
) : Human(fullName, age, currentSpeed) {

    private var direction: Double = kotlin.random.Random.nextDouble() * 2 * kotlin.math.PI

    override fun move() {
        val dx = currentSpeed * kotlin.math.cos(direction)
        val dy = currentSpeed * kotlin.math.sin(direction)
        x += dx
        y += dy
        println("Водитель $fullName на $vehicleType движется прямо в (${"%.2f".format(x)}, ${"%.2f".format(y)})")
    }

    override fun getFullName(): String {
        return "Водитель $fullName"
    }
}