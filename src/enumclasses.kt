//USEFUL FOR DROPDOWN MENUS ANDROID

fun main() {

    println(greetMe(Country.GERMANY))
    println(greetMe(Country.USA))

    for(country in Country2.entries) {
        println(country.code)
    }
}

enum class Country {
    //all uppercase
    //constant values
    //already known at compile time
    GERMANY, FRANCE, USA
}
//each country has code, which is string
enum class Country2(val code: String) {
    //all uppercase
    //constant values
    //already known at compile time
    GERMANY("DE"),
    FRANCE("FR"),
    USA("USA")
}


fun greetMe(country: Country): String {
    return when(country) {
        //right click
        //show context actions
        //add remaining branches
        //replace TODO() with what you want
        Country.GERMANY -> "Guten Tag"
        Country.FRANCE -> "Bonjour"
        Country.USA -> "Hello"
    }
}

fun greetMe2(country: Country): String {
    return when(country) {
        //right click
        //show context actions
        //add remaining branches
        //replace TODO() with what you want
        Country.GERMANY -> "Guten Tag"
        Country.FRANCE -> "Bonjour"
        Country.USA -> "Hello"
    }
}