interface Movable {
    val x: Double
    val y: Double
    val currentSpeed: Double
    val fullName: String

    fun move()
    fun getPosition(): Pair<Double, Double>
}