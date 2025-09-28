//import kotlin.math.sqrt
//
//fun main()  {
//    val rect1 = Rectangle(
//        width = 5f,
//        height = 7f
//    )
//    //rect1.diagonal //must be public otherwise can't access diagonal
//}
//
//data class Rectangle(
//    val width: Float,
//    val height: Float
//): Shape {
//    private val diagonal = sqrt(width*width+height*height) //can only be accessed
//    //here inside this class body
//    protected val protected = sqrt(width*width+height*height)
//    //protected should only be used if you have a parent class/open class/abstract class
//    override val area = width*height
//
//    override val circumference = 2 * width + 2 * height
//}
//
//abstract class Protect {
//    protected val counter: Int
//    //can be read inside protect class
//    //inside child classes
//    //but not outside
//    //you can't create a value and access this value using value.counter?
//
//    internal val intern: Int
//
//}