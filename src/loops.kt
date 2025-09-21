fun main() {
    val amountOfNumbers = readln().toIntOrNull() ?: 0 //?: 0 so charcters becomes 0

    //COUNT TO INPUT NUMBER
    var i = 0//counter variable aka current iteration of loop
    //count to input number
    while(i < amountOfNumbers) { //input is 7
        i++ //i + 1
        println(i) //print i
        //if input is 7: 1 2 3 4 5 6 7
    }

    //BASIC CALCULATOR
    println("How many numbers?")
    //input the amount of numbers youd like to enter
    val amountOfNumbers2 = readln().toIntOrNull() ?: 0 //?: 0 means characters become 0, error handling
    //set variables that will change
    var sum = 0
    var j = 0
    var numbers = intArrayOf() //create integer array variable.
    var numberslist = mutableListOf<Int>() //create mutable list, define what it contains in < >

    //while the counter variable is less than the number you put
    while(j < amountOfNumbers2) {
        println("Please enter number ${j + 1}")
        //input another number
        val number = readln().toIntOrNull() ?: continue


        //continue makes it so the next code doesn't run
        //the loop will continue but ask you to enter the same number again
        //this will happen if the input is not an integer

        //NOTE
        //val number = readln().toIntOrNull() ?: break
        //will break the entire loop if not integer

        sum += number //add the new number to the sum, which starts at 0
        numbers += number //creates new array everytime, adding number.
        numberslist.add(number) //adds number to list.
        //mutable list and numberslist.add() is better, because it doesn't create
        //a completely new thing everytime

        //add to counter, so it ends eventually once it reaches the number you put in at start.
        j++
    }
    println("The sum is $sum")
    println(numbers) //gibberish
    println(numbers.contentToString()) //the array numbers e.g. [1,2,3]
    println("my list $numberslist") //lists don't need { }, also dont need contentToString


    //ADD NUMBERS TO LIST AND ARRAYS
    println("How many numbers do you want to add to your list/array?")
    val amountOfNumbers3 = readln().toIntOrNull() ?: 0 //?: 0 means characters become 0, error handling
    var k = 0
    var numbers2 = intArrayOf()
    var numberslist2 = mutableListOf<Int>()
    while(k < amountOfNumbers3) {
        println("Please enter number ${k + 1}")
        val number2 = readln().toIntOrNull() ?: continue
        numbers2 += number2 //creates new array everytime, adding number.
        numberslist2.add(number2) //adds number to list.
        k++
    }

    println(numbers2) //gibberish
    println("My array! ${numbers2.contentToString()}") //the array numbers e.g. [1,2,3]
    println("my list $numberslist2") //lists don't need { }, also dont need contentToString


    //FOR LOOP
    println("This is an example of a for loop")
    println("What numbers do you want in your list?")
    val amountOfNumbers4 = readln().toIntOrNull() ?: 0 //enter amount
    val numbers3 = mutableListOf<Int>() //create empty list
    for(l in 0 until amountOfNumbers4) { //for item from 0 until amount
        println("Please enter number ${l + 1}")
        val number3 = readln().toIntOrNull() ?:  continue
        numbers3.add(number3)
    }
    println("Numbers: $numbers3")
    //ITERABLE VARIABLES
    //arrays are iterable, lists,
    //string are iterable, but prints individual letters of the string.\
    //a string is an array of characters
    //FOR LOOP
    for(number in numbers3) {
        println(number)
    }
    println("STRING")
    for(i in "STRING".lastIndex downTo 0) {
        println(i) //counts down based on amount of letters in STRING
    }
    val input = readln()
    val finalString = buildString {
        for(i in input.lastIndex downTo 0) {
            append(input[i]) //reverses the string you put
        }
    }
    println(finalString) //backwards
}