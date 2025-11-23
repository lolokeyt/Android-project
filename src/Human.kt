import kotlin.random.Random
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.PI

class Human(
    private var fullName: String,
    private var age: Int,
    private var currentSpeed: Double
) {
    private var x: Double = 0.0
    private var y: Double = 0.0

    fun getFullName(): String = fullName
    fun getAge(): Int = age
    fun getCurrentSpeed(): Double = currentSpeed
    fun getX(): Double = x
    fun getY(): Double = y

    fun setFullName(newName: String) { fullName = newName }
    fun setAge(newAge: Int) { age = newAge }
    fun setCurrentSpeed(newSpeed: Double) { currentSpeed = newSpeed }

    fun move() {
        val direction = Random.nextDouble() * 2 * PI
        val dx = currentSpeed * cos(direction)
        val dy = currentSpeed * sin(direction)

        x += dx
        y += dy
    }
}