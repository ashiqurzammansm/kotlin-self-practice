fun main() {
    // Ask the user to enter their score
    print("Enter your score (0–100): ")

    // Read input from the user and convert it to an integer
    val score = readLine()?.toIntOrNull()

    // Check if the score is valid (not null and in range)
    if (score != null && score in 0..100) {
        // Use conditional statements to classify the grade
        if (score >= 90) {
            println("Grade: A")
        } else if (score >= 80) {
            println("Grade: B")
        } else if (score >= 70) {
            println("Grade: C")
        } else if (score >= 60) {
            println("Grade: D")
        } else {
            println("Grade: F")
        }
    } else {
        // Handle invalid input
        println("Invalid input. Please enter a number between 0 and 100.")
    }
}
