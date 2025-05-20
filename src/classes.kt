fun main() {
    val app1 = Apartment()
    app1.name = "Mazuri"
    app1.location = "Kwajenga"
    app1.numOfOneBedroom = 2
    app1.numOfTwoBedroom= 11
    app1.hasCCTV = true
    app1.hasParking = true
    app1.printDetails()
}

class Apartment{
    var name : String= ""
    var location: String= "Westlands"
    var numOfOneBedroom: Int = 0
    var numOfTwoBedroom: Int = 0
    var numOfBedsitters: Int = 0
    var hasParking: Boolean = false
    var hasCCTV: Boolean = false

    fun printDetails(){
        println("-------------------------")
        println("Name : $name")
        println("Location : $location")
        println("One Bedroom : $numOfOneBedroom")
        println("Two Bedroom : $numOfTwoBedroom")
        println("Bedsitter : $numOfBedsitters")
        println("-------------------------")
    }
}