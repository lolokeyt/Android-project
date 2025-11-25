class Driver(
    override val fullName: String,
    private var age: Int,
    override var currentSpeed: Double,
    private val vehicleType: String
) : Movable {
    override var x: Double = 0.0
    override var y: Double = 0.0
    private var direction: Double = kotlin.random.Random.nextDouble() * 2 * kotlin.math.PI

    fun getAge(): Int = age
    fun setAge(newAge: Int) { age = newAge }
    fun setCurrentSpeed(newSpeed: Double) { currentSpeed = newSpeed }

    override fun move() {
        val dx = currentSpeed * kotlin.math.cos(direction)
        val dy = currentSpeed * kotlin.math.sin(direction)
        x += dx
        y += dy
        println("Водитель $fullName на $vehicleType движется прямо в (${"%.2f".format(x)}, ${"%.2f".format(y)})")
    }

    override fun getPosition(): Pair<Double, Double> = Pair(x, y)
}