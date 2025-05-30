fun main() {
    dataTypeMinAndMaxValue()
    averageSpeed()
}

fun dataTypeMinAndMaxValue(){
    val a: Byte = Byte.MIN_VALUE
    val b: Byte = Byte.MAX_VALUE
    println("Byte min value is $a")
    println("Byte min value is $b")

    println()

    val c: Short = Short.MIN_VALUE
    val d: Short = Short.MAX_VALUE
    println("Short min value is $c")
    println("Short min value is $d")

    println()

    val e: Int = Int.MIN_VALUE
    val f: Int = Int.MAX_VALUE
    println("Short min value is $e")
    println("Short min value is $f")

    println()

    val g: Long = Long.MIN_VALUE
    val h: Long = Long.MAX_VALUE
    println("Short min value is $g")
    println("Short min value is $h")
    println()
}


fun averageSpeed(){
    var speed: Float
    val distance: Float = 0.1f
    val time: Float = 9.87f / 3600

    speed=distance/time

    println("The average speed of a sprinter is $speed km/h")
}