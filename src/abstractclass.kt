import kotlin.math.sqrt

fun main() {
    //create rectangle
    val rect1 = AbstractRectangle(10f, 10f)
    println(rect1.counter) //prints counter var
    rect1.inc() //increase counter var
    println(rect1.counter) //print new counter var
}

//NOTE name the class something that isnt already in another .kt file you're using
//i think it reads that.

//CREATE ABSTRACT CLASS
abstract class AbstractShape {
    abstract val area: Float
    abstract val circumference: Float
    //abstract classes can have functions
    //classes INHERIT from abstract classes
    var counter = 0
    fun inc() {
        counter++
    }
}

data class AbstractRectangle(
    val width: Float,
    val height: Float
): AbstractShape() {
    val diagonal: Float = sqrt(width * width + height * height)
    override val area: Float = width * height
    override val circumference: Float = 2 * width + 2 * height
}

//data class and normal class not inheritable
//needs to be
//OPEN CLASS
//open class is inheritable but you can also make an instance on its own
open class AbstractShape2 {
    open val area: Float = 0f //this on its own gives error
    //need to include valid implementation in parent class?
    open val circumference: Float = 0f
    //abstract classes can have functions
    //classes INHERIT from abstract classes
    var counter = 0
    fun inc() {
        counter++
    }
}