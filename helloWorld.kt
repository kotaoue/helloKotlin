fun main() {
    val text:String = "Hello World!"
    printText(text)
    printText(text.uppercase())
    printText(text.lowercase())
    printText(text.reversed())
    printText(text.hashCode().toString())

    printCurrentTime()
    printCurrentTimeIsOddOrEven()

    val scuared: (Int) -> Int = { it * it }
    println(scuared(5))

    val add: (Int, Int) -> Int = { a, b -> a + b }
    println(add(5, 3))
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