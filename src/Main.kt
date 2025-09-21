// https://www.youtube.com/watch?v=dzUc9vrsldM&t=90s
//Philipp Lackner




//print hello world and create function
fun main() {
    println("HelloWorld!")

    println("Values, Data Types")
//values, data types
    //values are basically variables but you CANNOT change them later!!!
    val x = 5 //value x is 5
    // note: i don't know why it's forcing the indent here
    //you could do val y = 6, val z = 7.2f, val q = 7.1, ect, specifying is optional
    val y: Int = 6 //specify y has to be whole number/int, and set it to value 6
    val z: Float = 7.2f //needs f at end for 'float' 32 bit so uses less memory
    val q: Double = 7.1 //also a float, more accurate but uses more memory/ram bcuz 64 bit
    val b: Boolean = true //lowercase t
    val a = "Hello World"
    println(x)
    println(y)
    println(z)
    println(q)
    println(b)
    println(a)

    println("Variables")
    var c = "Hello World 2"
    //will be greyed out if it's redundant,
    //that doesn't mean it's incorrect, it's  just useless.
    // when you change it, write just c = " ", no writing var again.
    c = "Bye Bye World"
    println(c)
    println("Println (print line) vs print")
    println(c)
    print(c)
    print(c) //doesn't create new line

    println("Arithmetic Operators")
    println(x + y) //5 + 6
    println(x / y) //5 divided by 6
    // dividing an integer with integer will always be integer / whole number.
    // so 5 / 6 is 0
    println(x % y) //modulo / modulus
    // modulus is the remainder of the division.
    // if number % 2 == 0 that means its even number
    var d = 10
    println(d)
    d++ //shorthand for d + 1 aka 11, can't be used on val, only var.
    println(d)

    println("Comparison Operators")
    //23:10
    println(x == y) //is x same as y (false)
    println(x > y)
    println(x < y)
    println(x <= y)
    println(x >= y)
    val areNumbersTheSame = x == y //saves as value
    println(areNumbersTheSame)
    println(x % 2 == 0) //checks if x modulus 2 is equal to 0, returns true or false
    println("is x an even number $x") //in python itd be f"is x an even number {x}"
    println("Is x an even number ${x % 2 == 0}") //curly brackets for expression

    println("Logical Operators")
    println("&& is and")
    val areBothEven = x % 2 == 0 && y % 2 == 0 //&& is and
    println("Are both x and y even? ${areBothEven}")
    println("|| is or")
    val isOneEven = x % 2 == 0 || y % 2 == 0 //|| is or
    println("Is one or more of them even? ${isOneEven}")
    val twelve = 12
    val fourteen = 14
    val n = 3 + 3 * 3 //prioritizes 3x3, then does +3, so BODMAS
    val areBothEven2 = twelve % 2 == 0 || fourteen % 2 == 0 && twelve + fourteen == 25
    println(areBothEven2)
    //And is prioritized
    //so it's actually twelve % 2 == 0 || (fourteen % 2 == 0 && twelve + fourteen == 25)
    //compares result of fourteen % 2 == 0 && twelve + fourteen == 25 to twelve % 2 == 0

    println("Console Input")
    println("Enter a number")
    val input = readln()
    println("You've entered $input")
    //val isInputEven = input % 2 == 0 won't  work
    //Kotlin: Unresolved reference 'rem' for operator '%'
    //because it is STRING
    val inputToInt = input.toInt() //turn into integer
    val isInputEven = inputToInt % 2 == 0
    println(isInputEven)

    println("Nullability and null-safe operators")
    println("Enter a number again, if you don't it's error")
    val input2 = readln()
    val inputToIntOrNull = input2.toIntOrNull() //val = int?
    //note: don't capitalize the to in toIntOrNull
    println(inputToIntOrNull) //null if not number
    //val isInputEvenOrNull = inputToIntOrNull % 2 == 0 (NOT WORK)
    //computer has to consider that it may be null, and it would be impossible if it was null
    //so you cannot do this
    //all is prohibited on a nullable receiver of type 'Int?'. Use '?.'-qualified call instead.
    val isInputEvenOrNull = inputToIntOrNull!! % 2 == 0 //double !!
    //!! is discouraged to use,
    //because it doesn't really fix anything, just gives error later.
    println(isInputEvenOrNull)
    //if its string it gives error (NullPointerException)
    println("If you don't enter a number it'll be 0")
    val input3 = readln()
    val InputToIntOrNullWithQuestion = input3.toIntOrNull() ?: 0
    //if its not int, it becomes 0
    println(InputToIntOrNullWithQuestion)
    println("Anotherone")
    val input4 = readln()
    val InputToIntOrNullWithQuestionAndDot = input4.toIntOrNull()?.inc()
    //inc() increments value by 1
    //enter 1, and becomes 2, 4 becomes 5 (+1)
    //if its not int, null
    println(InputToIntOrNullWithQuestionAndDot)
//    val InputToIntOrNullWithQuestionAndDotRem = input4.toIntOrNull()?.rem( other: 2) == 0
    //they don't work if they have the possibility of being not int?
    val InputToIntOrNullWithQuestionAndDotRem = input4.toIntOrNull()?.rem(2)?.equals(0) //don't write other=2, just 2, for some reason it doesnt work when u manually put it in and it automatically does it for u idk what  the other = thing even means tbh
    //rem() is remainder, same as modulus
    println(InputToIntOrNullWithQuestionAndDotRem) //true or false if % 2 has remainder, aka even number

    println("If conditions")
    //47:37
}