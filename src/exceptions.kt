fun main() {
    //exceptions
    val input = readln()
//    throw Exception("STUPID ASSHOLE")
    //this creates your own exception ^ ^ ^
//    Exception in thread "main" java.lang.Exception: STUPID ASSHOLE
//    at ExceptionsKt.main(exceptions.kt:4)
//    at ExceptionsKt.main(exceptions.kt)
    val inputAsInteger = try {
        input.toInt() //tries turn to int
    } catch (e: NumberFormatException) { //if you input characters it turns to 0
        //use e: Exception for all possible exceptions
        0
    } finally {
        println("This is always executed no matter what")
    }

//NumberFormatException
    val output = when(inputAsInteger) { //must have else
//        null -> "please enter a valid number" not needed becuz of try catch
        3 -> "inputAsInteger is 3"
        5 -> "The number is 5"
        in 4 .. 10 -> "The number is between 4 and 5" //4 .. 10 is between 4 and 10
        else -> "dunno"
    }
    println(output)
}

//exceptions are 'thrown'
//which is why it's called 'catch'