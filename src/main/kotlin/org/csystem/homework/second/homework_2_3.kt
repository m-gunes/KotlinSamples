package org.csystem.homework.second

fun main() = runPrimeFactors()

fun runPrimeFactors() {
    print("Input a number:")
    val a = readln().toInt()
    printPrimeFactors(a)
}

fun printPrimeFactors(a: Int) {
    var a = a
    var value = 2

    while (a > 1)
        if (a % value == 0) {
            println(value)
            a /= value
        }
        else
            ++value
}
