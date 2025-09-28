fun main() {
    val favouriteNumbers = intArrayOf(1,2,3,69)
    val helloWorld = "Hello World"

    val evenNumbers = favouriteNumbers.filter { it % 2 == 0 } //filter called on array of int
    val lettersOnly = helloWorld.filter { it.isLetter() } //filter called on array of characters/string?
    val stringsList = listOf(
        "Hello World",
        "Bye bye",
        "Hows it going"
    )
    val integerList = listOf(
        1,2,3,4,5
    )
    val filteredStrings = stringsList.myFilter { currentString ->
        currentString.length > 10 //string with length higher than 10 will be kept
    }
    val filteredNumbers = integerList.myFilter { it < 3 }

    println(filteredStrings)
    println(filteredNumbers)

    val result =makeNetworkCall()
}
//generics
//type of information called on specific function
//only care  about whether its iterable, not whether its int or string etc

//first T can be anything but the  letter T is convention
//T is generic type parameter
fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for(element in this) {
        if(predicate(element)) {
            result.add(element)
        }
    }
    return result.toList()
}

fun makeNetworkCall(): Result<Int, String> {
    return Result.Failure("Something Went WRong")
}
sealed interface Result<out D, out E> { //can be sealed interface or sealed class because no constructor
    data class Success<D>(val data: D): Result<D, Nothing> //add () to end if its sealed class
    data class Failure<E>(val error: E): Result<Nothing, E> //add () to end if sealed class
}