import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Enter First Number: ")
    val firstNumber = input.nextInt()

    print("Enter Second Number: ")
    val secondNumber = input.nextInt()
    
    print("Enter Action (+, -, *, /, %): ")
    val choice = input.next()[0]


    val result = when(choice){
        '+' -> firstNumber + secondNumber
        '-' -> firstNumber - secondNumber
        '*' -> firstNumber * secondNumber
        '/' -> firstNumber / secondNumber
        '%' -> firstNumber % secondNumber
        else -> {
            System.err.println("Not a valid operation")
            return
        }
    }
    println(result)
}