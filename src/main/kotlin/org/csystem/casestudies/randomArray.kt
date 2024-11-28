package org.csystem.casestudies

import org.csystem.kotlin.util.array.randomArray
import org.csystem.kotlin.util.console.printArray

/**
 * Sınıf Çalışması: Parametresi ile aldığı Int türden bir dizinin elemanlarını stdout'a yazdıran printArray isimli
 * aşağıdaki fonksiyonu ve randomIntArray isimli aşağıdaki fonksiyonu sırasıyla console.kt ve arrayUtil.kt içerisinde yazınız
 * ve aşağıdaki kod ile test ediniz.
 *
 * Fonksiyonlar:
 *
 * fun printArray(a: DoubleArray, n: Int = 1, sep: String = " ", end: String = "\n")
 *
 * fun randomArray(count: Int, origin: Int, bound: Int, random: Random = Random): IntArray
 */
fun main() = runRandomIntArrayTest()

fun runRandomIntArrayTest() {
    while (true) {
        print("Input array count:")
        val count = readln().toInt()

        if (count < 1)
            break

        val a = randomArray(count, 1, 100)

        printArray(a)

    }
}