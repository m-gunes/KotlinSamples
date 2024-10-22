package org.csystem.casestudies

import kotlin.random.Random

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Hilesiz bir paranın yazı gelme olasığını yaklaşık olarak hesaplayan basit bir simülasyon programını yazınız.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runCoinSimulationApp()

fun runCoinSimulationApp() {
    print("Input number of reputation:")
    val n = readln().toInt()
    println("p = ${calculateCoinProbability(n)}")
}

fun calculateCoinProbability(n:Int): Double {
    // Olasilik bize ne gelecegini degil ne gelebilecegini soyle
    var count = 0

    for (i in 1..n)
        count += Random.nextInt(2) // Another solution: if(Random.nextBoolean()) ++count

    return count.toDouble() / n;
}
