package org.csystem.kotlin.util.console

fun printArray(a: DoubleArray, n: Int = 1, sep: String = " ", end: String = "\n") {
    for (i in a)
        print("$i$sep")

    print(end)
}

fun printArray(a: IntArray, n: Int = 1, sep: String = " ", end: String = "\n") {
    for (i in a)
        print("$i$sep")

    print(end)
}
