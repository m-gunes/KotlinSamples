package org.csystem.homework.second

import kotlin.math.abs

fun main() = runSnakePattern()

fun runSnakePattern() {
    print("Input a width value: ")
    val width = abs(readln().toInt())
    print("Input a height value: ")
    val height = abs(readln().toInt())
    printSnakePattern(width, height)
}

fun printSnakePattern(width: Int, height: Int) {
    var right = true
    var pointPosition = 1

    fun calcDirection() = when (pointPosition) {
        width -> right = false
        1 -> right = true
        else -> {}
    }

    fun calcPosition() = if(right) ++pointPosition else --pointPosition;

    fun printLine() {
        print("|")
        for (i in 1..width)
            if(i == pointPosition)
                print("*")
            else
                print(" ")
        println("|")
    }

    for (i in 1..height) {
        printLine()
        if (width > 1) {
            calcDirection()
            calcPosition()
        }
    }
}
