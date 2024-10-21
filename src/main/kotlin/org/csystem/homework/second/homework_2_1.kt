package org.csystem.homework.second

fun main() = runDiamondPattern()

fun runDiamondPattern() {
    print("Input a number")
    val n = readln().toInt()
    printDiamondPattern(n)
}

fun printDiamondPattern(n: Int) {

    fun printSpace(n: Int) {
        for (i in 1 .. n)
            print(' ')
    }

    fun printStar(n: Int) {
        for (i in 1 .. n)
            print('*')
    }

    fun upperPartOfPattern() {
        var startCount = 1
        for (i in 1 .. n) {
            printSpace(n-i)
            printStar(startCount)
            startCount += 2
            printSpace(n-i)
            println()
        }
    }

    fun lowerPartOfPattern() {
        var startCount = n * 2 - 1;
        for (i in 1..< n) {
            printSpace(i)
            startCount -= 2;
            printStar(startCount)
            printSpace(i)
            println()
        }
    }

    upperPartOfPattern()
    lowerPartOfPattern()
}
