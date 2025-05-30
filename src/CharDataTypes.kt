import java.util.Arrays

fun main() {
    charToStr()
    arrayToString()
}

fun charToStr(){
    val ch = 'c'
    val str = ch.toString()
    println(str) //Using

    val chr = 'c'
    val strn = "$chr"
    println(strn) //Using String Interpolation

    val chrr = 'c'
    val strr = String(charArrayOf(chrr))
    println(strr) //Using String(charArray) Constructor
}

fun arrayToString(){
    val name = "Hello World"
    val chars = name.toCharArray()
    print(Arrays.toString(chars)) // Have to study more
}