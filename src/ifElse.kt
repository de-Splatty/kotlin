fun main() {
    print("Enter your weight in Kgs:")
    val w = readln()
    print("Enter your height in meters:")
    val h = readln()

    val weight = w.toDouble()
    val height = h.toDouble()

    val bmi = weight/ (height * height)
    if (bmi < 18.5)
    {
        println("underweight")
    }
    else if (bmi >= 18.5 && bmi< 24.9)
    {
        println("Normal weight")
    }
    else if (bmi >= 25 && bmi<29.9 )
    {
        println("overweight")
    }
    else if (bmi >=30.0 && bmi < 34.9 )
    {
        println("Obesity class 1")
    }
    else if (bmi >= 35 && bmi < 39.9)
    {
        println("Obesity class 2")
    }
    else
    {
        println("Obesity class 3")
    }

    val message = when(bmi){
        in 0.0 .. 18.5 -> "Underweight"
        in 18.5.. 24.9 -> "Normal weight"
        in 25.0..29.9 ->"Overweight"
        in 30.0..34.9 ->"Obesity Class 1"
        in 35.0..39.9 ->"Obesity class 2"
        else ->"Obesity class 3"
    }

    println(message)
}