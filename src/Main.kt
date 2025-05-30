fun main(){
    val result = add(10,20)
    println(result)
    val result1 = add(5,4)
    println(result1)
    evenOrOdd(44)
    evenOrOdd(11)
}

fun add(num1:Int, num2:Int): Int{
    val sum = num1 + num2
    return sum
}

fun evenOrOdd(num1: Int){
    val result = if (num1 %2 ==0)"Even" else "Odd"
    println(result)
}