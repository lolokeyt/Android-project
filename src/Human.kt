import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.PI

class Human(
    override val fullName: String,
    private var age: Int,
    override var currentSpeed: Double
) : Movable {
    override var x: Double = 0.0
    override var y: Double = 0.0

    fun getAge(): Int = age
    fun setAge(newAge: Int) { age = newAge }
    fun setCurrentSpeed(newSpeed: Double) { currentSpeed = newSpeed }

    override fun move() {
        val direction = kotlin.random.Random.nextDouble() * 2 * PI
        val dx = currentSpeed * cos(direction)
        val dy = currentSpeed * sin(direction)
        x += dx
        y += dy
        println("$fullName переместился в (${"%.2f".format(x)}, ${"%.2f".format(y)})")
    }

    override fun getPosition(): Pair<Double, Double> = Pair(x, y)
}