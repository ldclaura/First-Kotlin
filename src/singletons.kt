//singleton is single instance of class
//, single instance across entire runtime of program.
//object = class with no constructor?

//this code doesn't work lol
//i meseed  sometig up
//google when you need it
fun main() {
    println(FixSizeSquare.area)
}
sealed interface SingleShape {
    val area: Float
    val circumference: Float
}

object FixSizeSquare: SingleShape {
    override val area = 16.0
    override val circumference = 16.0
}