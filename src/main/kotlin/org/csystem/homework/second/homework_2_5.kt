package org.csystem.homework.second

import org.csystem.casestudies.isPrime

fun main() = runGoldbach()

fun runGoldbach() {
    print("Input an even number greater than 2:")
    val a = readln().toLong()
    printGoldbach(a)
}

fun printGoldbach(a: Long) {
    for (x in a-1 downTo 2) {
        val y = a-x
        if (x >= y && isPrime(x) && isPrime(y))
            println("$x + $y = $a")
    }
}
