fun main() {
    //'primitive' data type?
    println("ARRAYS!!")
    //create array
    val favouriteNumbers = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    println(favouriteNumbers)//[I@452b3a41

    //get index
    println(favouriteNumbers[0]) //index 0, same as python

    //prevent error, returns null
    println(favouriteNumbers.getOrNull(10)) //there's only 9 index so itll be null

    //get index from input
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    val favouriteNumbers2 = intArrayOf(1,2,3,69)

    if(inputAsInteger != null && inputAsInteger < favouriteNumbers2.size) {
        println("Your number is ${favouriteNumbers2[inputAsInteger]}")
    } else {
        println("That index doesn't exist")
    }
            //but what if you put a negative number???
    //prevent error from negative number
    if(inputAsInteger != null && inputAsInteger in 0 .. favouriteNumbers2.lastIndex) {
        println("Your number is ${favouriteNumbers2[inputAsInteger]}")
    } else {
        println("That index doesn't exist")
    }

    //once the array is created, you cannot add numbers to it.
    val addingArrays = intArrayOf(1,2,3,4) + 5//this creates a completely new array.
    println(addingArrays[4])

    //you can change numbers though
    favouriteNumbers[9] = 69 //turn index 9 (number 10, last one) into 69
    println(favouriteNumbers[9])
}