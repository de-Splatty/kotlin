fun main() {
    val name = "Bubblegum"
    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    val num = "100"
    val num2 = num.toInt()
    val num3 = "100.65"
    val num4 = num3.toDouble()
    println(num2 * num4)

    name.startsWith("Bu")
    name.endsWith("um")
    name.contains("g")
    val replaced = name.replace("gum", "gammers")
    println(replaced)
    val city = "london"
    city.trim()
}