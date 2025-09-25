fun main() {

}

//CREATE ABSTRACT CLASS
abstract class Shape {
    abstract val area: Float
    abstract val circumference: Float
}

data class Rectangle(
    val width: Float,
    val height: Float
): Shape() {
    val diagonal = sqrt(width * width + height * height)
    override val area = width * height
    override val circumference = 2 * width + 2 * height
}
