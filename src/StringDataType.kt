fun main() {
    upperLower()
   // compareTo()
   // indexCheck()
   // stringAdd()
   // stringItem()
   // stringLength()
   // trimMargin()
   // bldStr()
}
fun upperLower(){
    var txt = "Hello World"

    println(txt.capitalize())
    println(txt.uppercase())
    println(txt.lowercase())
    println()
}

fun compareTo(){
    var txt1 = "Abcs World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))
    println()
}

fun indexCheck(){
    var txt = "Hello boss Whats up?"
    println(txt.indexOf("Whats"))
}

fun stringAdd(){
    val firstName = "SM"
    val lastName = "ASHIQURZAMMAN"
    println(firstName + " "+lastName) //Simple way
    println(firstName.plus(" ").plus(lastName)) //.plus way
}

fun stringItem(){
    var myString: String = "Hello World"

    for (item in myString){
        println(item)
    }
    println()
}

fun stringLength(){
    var lengtt: String = "HiHebbo BYEBYE"
    //println(lengtt.length)
   // println(lengtt[5]) //Check index of 5
    println(lengtt[lengtt.length-6]) // If i count from last then will start from -1

    // println(lengtt.first())
    // println(lengtt.last())

    println()
}

fun trimMargin(){
    val text = """
    |This is line one
    |This is line two
    |This is line three
""".trimMargin()

    println(text)
}

fun bldStr(){
    var str1: String = buildString { "Hello World" }
    var str2: String = buildString { "Hi Baby" }
    println(str1 === str2)
    println(str1!==str2)
}


