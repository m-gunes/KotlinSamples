package org.csystem.casestudies

import kotlin.random.Random

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Hilesiz iki zar atma deneyinde çift (ikisinin aynı olması) gelme olasılığını yaklaşık olarak
    hesaplayan basit simülasyon programını yazınız.
---------------------------------------------------------------------------------------------------------------------*/


fun main() = runDiceProbabilityApp()

fun runDiceProbabilityApp(){
    print("Input number of reputation:")
    val n = readln().toInt()
    println("p = ${calculateDiceProbability(n)}")
}

fun calculateDiceProbability(n:Int): Double {
    fun areSame() = Random.nextInt(1,7) == Random.nextInt(1,7)
    var count = 0;

    for (i in 1..n)
        if(areSame())
            ++count

    return count.toDouble() / n;
}
