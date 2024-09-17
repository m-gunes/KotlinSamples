// Homework-001-1.sorunun çözümü

package org.csystem.homework.firsth

import kotlin.math.max
import kotlin.math.min

fun main() = runPrintOrderedNumberApp()

fun runPrintOrderedNumberApp() {
    println("Üç tane sayı giriniz:")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    printOrderedNumber(a,b,c)
}

fun printOrderedNumber(a:Int, b:Int, c:Int) {
    val max =  max(a, max(b, c))
    val min = min(a, min(b, c))
    val mid = (a + b + c) - (min + max)

    when {
        min == mid -> print("$min = $mid ")
        else -> print("$min < $mid ")
    }

    when {
        mid == max -> print("= $max")
        else -> print("< $max")
    }
}
