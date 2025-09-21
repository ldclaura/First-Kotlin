fun main() {
    println("If conditions")
    //47:37
    println("Enter a number")
    val input = readln()
    //val isInputEven = input % 2 == 0 won't  work
    //Kotlin: Unresolved reference 'rem' for operator '%'
    //because it is STRING
    val inputToInt = input.toInt() //turn into integer
    if(inputToInt == 1) {
        println("You put in 1 on the first input")
    } else {
        println("You did not put in 1 on the first input")
    }


    if(inputToInt != null) {
        val input1even = inputToInt % 2 == 0
        println("Is even? $input1even")
        if(input1even) {
            println("Yay, it's even!")
        } else {
            println("Nooo it's odd!!!")
        }


        println("OR YOU COULD DO")
        if(!input1even) { //if input1even == false
            println("The number is odd $input1even")
        }
    }


    //sets string value output as either "the number is even!" or "the number is odd!"
    val output = if(inputToInt % 2 == 0) {
        "The number is even!"
    } else { // could use else null, will make it into a string? instead of string
        "The number is odd!"
    }
    println(output)
}