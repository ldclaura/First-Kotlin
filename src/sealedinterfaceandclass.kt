fun main() {

}

//SEALED INTERFACE
//a sealed interface
//can only be implemented in current project/module
//can only be defined in own code? not library
sealed interface SealedShape {
    val area: Float
    val circumference: Float
}

//fun printShapes(vararg shapes: Shape) {
//    for(shape in shapes) {
//        val output = when(shape) {
//            is Circle -> "Yo that's a circle"
//            is Rectangle -> "Yo that's a rectangle"
//            else -> null
//        }
//        println(output)
//    }
//}

fun printShapes(vararg shapes: SealedShape) {
    for(shape in shapes) {
        val output = when(shape) {
            is Circle -> "Yo that's a circle"
            is Rectangle -> "Yo that's a rectangle"
            //else -> null not needed
        }
        println(output)
    }
}