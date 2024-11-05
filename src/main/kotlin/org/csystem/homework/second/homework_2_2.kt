package org.csystem.homework.second

fun main() = runPrintDuration()

fun runPrintDuration() {
    print("Input a second: ")
    val second = readln().toLong();
    printDuration(second)
}

fun printDuration(second: Long) {
    val hours = second / 60 / 60
    val minutes = second / 60 % 60
    val seconds = second % 60

    if (hours > 0)
        print("${hours} hour ")

    if (minutes > 0)
        print("${minutes} minute ")

    if (seconds > 0)
        print("${seconds} second ")
}
