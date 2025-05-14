fun main() {
    val scores = listOf(10, 22, 23, 65, 89, 19)
    val sortedscores = scores.sorted()
    println(sortedscores)
    println(scores[0])
    println(scores.first())
    println(scores.last())
    println(scores.size)
    println("you have ${scores.size} scores")
    println("Last person scored ${scores.last()}")
    val x = 100
    println("Value of x is $x")

    val temp = mutableListOf(10, 20, 30, 40, 50)

    temp.add(47)

    temp.remove(20)
    temp.removeAt(4)
    println(temp)
}