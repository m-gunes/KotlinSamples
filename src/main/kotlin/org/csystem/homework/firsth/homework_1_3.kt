// Homework-001-3.sorunun çözümü

package org.csystem.homework.firsth

fun main() = runSignumTest()

fun runSignumTest() {
    print("Bir sayı giriniz:")
    val a = readln().toInt()
    println("signum = ${signum(a)}")
}

fun signum(a: Int) = when {
    a > 0 -> 1
    a < 0 -> -1
    else -> 0
}
