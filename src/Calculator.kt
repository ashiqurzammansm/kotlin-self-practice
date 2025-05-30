import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Enter the first number: ")
    val firstNumber = input.nextInt()
    print("Enter the second number: ")
    val secondNumber = input.nextInt()

    print("Enter a valid operation(+, -, *, /, %): ")
    val choice = input.next()[0]

    val result = when(choice){
        '+' -> firstNumber + secondNumber
        '-' -> firstNumber - secondNumber
        '*' -> firstNumber * secondNumber
        '/' -> firstNumber / secondNumber
        '%' -> firstNumber % secondNumber
        else -> {
            System.err.print("Not a valid operation")
        }
    }
    println(result)
}