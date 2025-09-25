//Donn Felker how to imprement an interface in kotlin
//https://www.youtube.com/watch?v=HJeOQ62o_6c
fun main() {

}

interface Discountable {
    fun discountPercent(): Double
}

//class GenericToy implements the Discountable interface
//1 - type 'class GenericToy: Discountable'
//2 - hover over red squiggly
//3 - click lightbulb
//4 - click implement members
class GenericToy: Discountable {
    override fun discountPercent(): Double {
        TODO("Not yet implemented")
    }
}