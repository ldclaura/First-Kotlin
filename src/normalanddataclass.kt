import kotlin.math.PI
import kotlin.math.sqrt

//2:07:35

//bundle certain data
//blueprint to buidl something

fun main() {
    //an instance of the class
    //an instance of Rectangle
    val rect1 = Rectangle( //calling constructor with specific arguments
        width = 5,
        height = 7
    )

    println(rect1.width)
    println(rect1.height)

    val rect2 = Rectangle2(
        width = 5f,
        height = 7f
    )
    println(rect2.diagonal)
    println(rect2.area)

    val rect3 = Rectangle2(
        width = 5f,
        height = 7f
    )
    //data class instance
    val rect4 = Rectangle3(
        width = 5f,
        height = 7f
    )
    //data class instance
    val rect5 = Rectangle3(
        width = 5f,
        height = 7f
    )

    //DATA CLASS COPY
    //copy instance
    //only works with data class
    val rect6 = rect5.copy(
        //width stays the same as rect5
        height = 10f
    )
    val circle = Circle(radius = 5f)
    val rectangleshape = RectangleShape(10f, 10f)
    val circleshape = CircleShape(10f)


    //classes by default are comparable
    //but even if u give exact same values, they won't be the same.
    //classes are not compared based on their contents.
    //compared by REFERENCE.
    //checks whether rect2 is same instance as rect3
    println(rect2 == rect3)
    //to compare based on contents...
    //use data class
    println(rect4 == rect5)
    println("class: $rect3")
    println("data class: $rect4")
    println(circle.area)
}


//CREATE CLASS
class Rectangle(val width: Int, val height: Int) //what is inside () is called CONSTRUCTOR of the class
//because it's needed to construct instance of class.

//CLASS BODYS
class Rectangle2(val width: Float, val height: Float) { //needed to import sqrt
    val diagonal = sqrt(width * width + height * height) //sqrt is square root
    //since sqrt only takes floats you will need to change from int in some way
    val area = width * height
}

fun maxArea(rect1: Rectangle2, rect2: Rectangle2): Float {
    val area1 = rect1.area
    val area2 = rect2.area
    return maxOf(area1, area2)


}
data class Rectangle3(val width: Float, val height: Float) { //needed to import sqrt
    val diagonal = sqrt(width * width + height * height) //sqrt is square root
    //since sqrt only takes floats you will need to change from int in some way
    val area = width * height
}
data class Circle(val radius: Float) {
    val area = radius * radius * PI //kotlin already has PI
    val diameter = 2 * radius
}



//INTERFACES
//a way to define a contract for a class
//outlines what a shape needs to offer in terms of functionality and variables

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    //sumof returns double,not float, so it all has to return double.

    }
}
//CREATE INTERFACE
interface Shape {
    val area: Float
    val circumference: Float
    //not every shape has diameter so dont include that
    //all shapes nwo need area and circumference.
}
//DATA CLASS WITH INTERFACE
//after the class colons (), add Shape.
data class RectangleShape(
    val width: Float,
    val height: Float,
): Shape {
    //go into top left 3 bars menu, code, then implement methods
    //will automatically add all this
    //a shape interface needs area and circumference.
    override val area: Float
        get() = TODO("Not yet implemented")
    override val circumference: Float
        get() = TODO("Not yet implemented")
}
data class CircleShape(val radius: Float): Shape {
    override val circumference: Float
        get() = TODO("Not yet implemented")
    override val area: Float
        get() = TODO("Not yet implemented")
    val diameter = 2 * radius
}