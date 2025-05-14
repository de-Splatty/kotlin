import kotlin.math.round

fun main() {
    hello()
    areaCircle(21)
    areaCircle(164)
    volumeCylinder(45.0, 10.0, true )
    volumeCylinder(h= 10.0, r= 45.0)
}

fun  hello(){
    val name = "Adkins"
    println("Good afternoon $name")
}

fun areaCircle(r: Int){
    val result = 22/7.0 * r * r
    println("Area is $result")
}

//course hunter

fun volumeCylinder(r: Double, h:Double, rounded:Boolean=false){
    var v = 22/7.0 * r * r * h
    if(rounded){
        v = round(v)
    }
    println("Volume is $v")
}