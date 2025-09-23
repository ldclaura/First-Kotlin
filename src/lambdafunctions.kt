//1:52:25
//buildString func
//buildString takes lambdafunction as argument
//lambda functions are functions that can be passed in parameter as another function

fun main() {
    println("Enter a string:")
    val input = readln()

    val favouriteNumbers = intArrayOf(1,2,3,69)
    val evenNumbers = favouriteNumbers.filter { it % 2 == 0 } //'it' is the predicate
    println(evenNumbers)

    //filters whether the character is letter
    //.filter checks character, basically turns to bool
    //letter = True
    val lettersOnly = input.filter {//filter  or filter(), dont matter in this case
    it.isLetter() //'it' is the parameter the lambda takes, aka every character of string
    }

    //ANOTHER METHOD
    println(lettersOnly)
    val lambda: (Char) -> Boolean = { //if type can not be inferred, must be defined explicitly
        it.isLetter()
    }
    val lettersOnly2 = input.filter(lambda)
    println(lettersOnly2)

    //SETTING NAME OF 'IT'
    //important if it takes multiple types of parameters.

    val lettersOnly3 = input.filter { currentCharacter ->
        currentCharacter.isLetter() //'it' can now not be used, it is now currentCharacter
    }
    println(lettersOnly3)

    //create lambda func
    //takes string, takes character from string, turns to boolean, returns string
    fun String.myFilter(predicate: (Char) -> Boolean): String {
        return buildString {
            for(char in this@myFilter) {
                if(predicate(char)) {
                    append(char)
                }
            }
        }
    }
    val lettersOnly4 = input.myFilter {
        it.isLetter()
    }
    println(lettersOnly4)

    //MAP
    val mappedNumbers = favouriteNumbers.map {
        it * it //squares numbers
    }
    println(mappedNumbers)

    //ANOTHER WAY
    fun String.myFilter2(predicate: Char.() -> Boolean): String {
        return buildString {
            for(char in this@myFilter2) {
                if(char.predicate()) {
                    append(char)
                }
            }
        }
    }
    val lettersOnly5 = input.myFilter2 {
        isLetter() //or this.isLetter()
        //this' refers to current char
    }
    println(lettersOnly5)
}
