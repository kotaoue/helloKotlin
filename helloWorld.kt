fun main() {
    val text:String = "Hello World!"
    printText(text)

    printCurrentTime()
}

fun printText(text: String) {
    println(text)
}

fun printCurrentTime() {
    println(System.currentTimeMillis())
    println(java.time.LocalDateTime.now())
}