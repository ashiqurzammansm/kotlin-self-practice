fun main() {
    println("Simple Kotlin Calculator")
    println("----------------------------")

    while (true) {
        println("Choose an operation:")
        println("1. Addition (+)")
        println("2. Subtraction (-)")
        println("3. Multiplication (*)")
        println("4. Division (/)")
        println("5. Exit")
        print("Enter your choice (1-5): ")

        val choice = readLine()?.toIntOrNull()

        if (choice == 5) {
            println("Exiting calculator...")
            break
        }

        if (choice !in 1..4) {
            println("Invalid choice. Please try again.")
            continue
        }

        print("Enter first number: ")
        val num1 = readLine()?.toDoubleOrNull()
        print("Enter second number: ")
        val num2 = readLine()?.toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Invalid input. Please enter numbers.")
            continue
        }

        when (choice) {
            1 -> println("Result: ${num1 + num2}")
            2 -> println("Result: ${num1 - num2}")
            3 -> println("Result: ${num1 * num2}")
            4 -> {
                if (num2 == 0.0) {
                    println("Error: Division by zero is not allowed.")
                } else {
                    println("Result: ${num1 / num2}")
                }
            }
        }

        println()
    }
}