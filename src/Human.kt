import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.PI

open class Human(
    protected var fullName: String,
    protected var age: Int,
    protected var currentSpeed: Double
) {
    protected var x: Double = 0.0
    protected var y: Double = 0.0

    fun getFullName(): String = fullName
    fun getAge(): Int = age
    fun getCurrentSpeed(): Double = currentSpeed
    fun getX(): Double = x
    fun getY(): Double = y

    fun setFullName(newName: String) { fullName = newName }
    fun setAge(newAge: Int) { age = newAge }
    fun setCurrentSpeed(newSpeed: Double) { currentSpeed = newSpeed }

    open fun move() {
        val direction = kotlin.random.Random.nextDouble() * 2 * PI
        val dx = currentSpeed * cos(direction)
        val dy = currentSpeed * sin(direction)
        x += dx
        y += dy
        println("$fullName переместился в (${"%.2f".format(x)}, ${"%.2f".format(y)})")
    }
}