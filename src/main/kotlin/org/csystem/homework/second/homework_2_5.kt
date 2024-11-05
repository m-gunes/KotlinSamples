package org.csystem.homework.second

import org.csystem.casestudies.isPrime

fun main() = runGoldbach()

fun runGoldbach() {
    print("Input an even number greater then 2:")
    val a = readln().toLong()
    printTwoPrimeNumber(a)

}

fun printTwoPrimeNumber(a: Long) {
    for (i in 2..a)
        if(isPrime(i))
            println(i)
}
