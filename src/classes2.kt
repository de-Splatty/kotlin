import java.time.LocalDateTime

fun main() {
    val m1 = Chat(
        "Salutations",
        "2025-05-18 ",
        "076788990",
        "0123667788"
    )
    m1.printMessage()
    println(m1.isRead)
    m1.isRead = true

    val m2 = Chat(
        recipient = "0723437890",
        dateTime = "2026-04-17",
        sender = "0765336790",
        message = "great"
    )

}

class Chat(
    var message: String,
    var dateTime: String,
    var sender: String,
    var recipient: String,
    var isRead: Boolean = false,
    var isSeenOnce: Boolean = false,
    var isBackedUp: Boolean = false
) {
    fun printMessage() {
        println(message)
    }


}