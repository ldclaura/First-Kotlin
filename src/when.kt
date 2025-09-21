fun main() {
    //when
    val input = readln()
    val inputAsInteger = input.toInt()

    if(inputAsInteger != null) {
        val output = when {
            inputAsInteger % 2 == 0 -> "Even"
            inputAsInteger < 10 -> "Number is odd and less than 10"
            else -> {
                println("Hello :)")
                "I dunno lol"
            }
        }
        println(output)
    }
    //if lots of different conditions u can do this
    val output2 = when(inputAsInteger) { //must have else
        null -> "please enter a valid number"
        3 -> "inputAsInteger is 3"
        in 4 .. 10 -> "The number is between 4 and 5" //4 .. 10 is between 4 and 10
        else -> "dunno"
    }
    println(output2)




}