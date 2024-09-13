package org.csystem.casestudies

/*---------------------------------------------------------------------------------------------------------------------
    Bir sayının asal olup olmadığını test eden isPrime fonksiyonu ve test kodu
    (Yavaş versiyon)
    Kural: Bir sayiyi yarisindan sonrasi bolemez!
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runIsPrimeSlowTest()

fun runIsPrimeSlowTest() {
    for (n in 1L..100)
        if (isPrime(n))
            print("$n ")
    println()
    println(if (isPrimeSlow(1_000_003)) "Asal" else "Asal değil")
}

fun isPrimeSlow(a: Long): Boolean {
    if(a <= 1)
        return false

    for(i in 2..a / 2)
        if(a % i == 0L)
            return false

    return true
}