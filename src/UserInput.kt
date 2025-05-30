import java.util.Scanner

fun main() {
    //readLnUserInput()
    //scannerUserInput()
    anotherInputSystem()
}

fun readLnUserInput(){
    println("Enter Your name")
    var name: String = readln()
    println("Enter your age")
    var age: Int = readln().toInt()
    println("Your name is $name and your age is $age")
}

fun scannerUserInput(){
    val read = Scanner(System.`in`)
    println("Enter a number")
    var number = read.nextInt() //To input only number
    // var name1 = read.next() // To input Anything
    // var num1 = read.nextFloat() // To input Float
    println("You have entered $number")
}

fun anotherInputSystem(){
    println("Enter Text")

    val stringInput = readln()!!
    println("You entered: $stringInput")
}