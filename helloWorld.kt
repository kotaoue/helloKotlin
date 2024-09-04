fun main() {
    val text:String = "Hello World!"
    printText(text)
    printText(text.uppercase())
    printText(text.lowercase())
    printText(text.reversed())
    printText(text.hashCode().toString())

    printCurrentTime()
    printCurrentTimeIsOddOrEven()
}

fun printText(text: String) {
    println(text)
}

fun printCurrentTime() {
    println(System.currentTimeMillis())
    println(java.time.LocalDateTime.now())
}

fun printCurrentTimeIsOddOrEven() {
    val currentTime = System.currentTimeMillis()
    val result = if (currentTime % 2 == 0L) {
        "Even"
    } else {
        "Odd"
    }
    println(result)
}