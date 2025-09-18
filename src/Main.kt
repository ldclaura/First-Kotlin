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
    var d = 10
    println(d)
    d++ //shorthand for d + 1 aka 11, can't be used on val, only var.
    println(d)

    println("Comparison Operators")
    //23:10
}