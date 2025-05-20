fun main() {
   val a =  addTwo(3,56)
   val b = addTwo(56, 45)
    println("Result is $a")
    println("Result is $b")

    println(isExactlyDivisible(19086546.0, 24.0))
    val res = isExactlyDivisible(70.0, 10.0)
    println("Is divisible $res")


    println(addNumbers(34, 4))
    println(exactlyDivisible(9.toDouble(), 3.toDouble()))
}

fun addTwo(x: Int, y: Int): Int{
    val result = x + y
//    println("Sum is $result")
    return result
}

fun isExactlyDivisible(a: Double, b:Double):Boolean {
    if (a%b == 0.0) //modulus
    {
        return true
    }
    return false
}

val addNumbers = {a:Int, b:Int -> a + b }
val exactlyDivisible = {k: Double, d: Double-> k % d == 0.0}