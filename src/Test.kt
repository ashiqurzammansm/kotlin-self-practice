fun main() {
    print("Enter a number within (0-100): ")

    val score = readln().toIntOrNull()

    if (score != null && score in 0..100){
        if (score >= 90){
            println("Grade A")
        }else if(score >= 80){
            println("Grade B")
        }else if (score >= 70){
            println("Grade C")
        }else if(score >= 60){
            println("Grade D")
        }else{
            println("Grade F")
        }
    }else{
        println("Invalid Input")
    }
}