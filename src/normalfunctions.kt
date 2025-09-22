//1:31:26
//readln() FUNCTION
//toIntOrNull() FUNCTION
//functions all have ()

//NOTE functions can be called on lines before they are defined.
//i believe that all code has to be within the main function
//new functions can be defined after that, and then called in main function
//a parameters type has to be specified, parameter: String
//The return type also specified, fun func(param: String): String
//aka parameter is string, and it returns a string.
fun main() {
    println("Main Function")

    reversed("laura")

    println(reversed2("laura2"))

    val reversed3 = reversed2("Laura3")
    println(reversed3)

    println(reversed3())

    //name your parameters
    //just makes it more readable

    val reversed4 = reversed2(word = "Laura3")
    println(reversed4)

    val input = readln()
//    val inputAsInteger = input.toInt() //input.toInt() is an...
    //EXTENSION FUNCTION
    //functions can be called on objects
//    println(input.reversed4()) <-- this doesnt work some reason

    val inputreversed = input.reversed4()
    println(inputreversed)
    //FUNCTION OVERLOADING
    val input2 = readln().toInt()
    println(input2 + input2.reversed4())

    val numberreversed = reversed2(input2)
    println(numberreversed)



}

fun reversed(word: String) { //must specify type of parameter e.g. string
    val finalString = buildString {
        for(i in word.lastIndex downTo 0) {
            append(word[i]) //reverses the string you put
        }
    }
    println(finalString) //backwards
}
//specify return type (word: String): String
//aka parameter: String and returns: String
fun reversed2(word: String): String { //specify return type (...): String
    val finalString = buildString {
        for(i in word.lastIndex downTo 0) {
            append(word[i]) //reverses the string you put
        }
    }
    return finalString //backwards
}
//default values of parameters
//sets parameter as "Hello World" if not specified.
fun reversed3(
    word: String = "Hello World" //<-- if you don't specify param, it's Hello World
): String { //specify return type (...): String
    val finalString = buildString {
        for(i in word.lastIndex downTo 0) {
            append(word[i]) //reverses the string you put
        }
    }
    return finalString //backwards
}
//EXTENSION FUNCTIONS
fun String.reversed4(): String {
    //use keyword 'this'
    //'this' is a keyword that refers to String in String.reversed4()
    val finalString = buildString {
        //for(i in this.lastIndex downTo 0) {
        //compiler already adds this, so no need to write it in this line
        //well, in this context you do
        for(i in this@reversed4.lastIndex downTo 0) {
            append(this@reversed4[i]) //must keep this[], can't just do []
            //in this context 'this' can refer to something else,
            //so you need to add @reversed4

        }
    }
    return finalString //backwards
}

//FUNCTION OVERLOADING
fun Int.reversed4(): Int {
    //if the input is integer,
    //it runs this
    //which turns the int, into string,
    //then runs the previous function String.reversed4,
    //then turns it back into an integer.
    //which means 19 becomes 91 ect
    return this.toString().reversed4().toInt() //backwards
}

//same thing
fun reversed2(
    number: Int
): Int {
    //the tutorial has
    //return number.toString().reversed2().toInt()
    //but i can't get that working for whatever reason
    //my solution works though V
    return reversed2(number.toString()).toInt()
}
