// Homework-001-2.sorunun çözümü

package org.csystem.homework.firsth

fun main() = runMidTest()

fun runMidTest() {
    println("Üç tane sayı giriniz:")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println("mid = ${mid(a, b, c)}")
}

fun mid(a: Int, b: Int, c: Int) = when {
    (a <= b || a <= c) && (a >= b || a >= c) -> a
    (b <= a || b <= c) && (b >= a || b >= c) -> b
    else -> c
}