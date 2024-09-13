package org.csystem.coursework

/*---------------------------------------------------------------------------------------------------------------------
    Bir sayının asal olup olmadığını test eden isPrime fonksiyonu ve test kodu
    (Hızlı versiyon)

    Kural: Bir sayının asal olması için karekökünden daha küçük olan asal sayıların hiçbirisine bölünememesi gerekir*
    Bir sayi karakokunden kucuk olan hic bir asal sayiya tam olarak bolunemiyorsa asaldir
    If a number is not divisible by a number less than its square root, then it is a prime number.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runIsPrimeTest()

fun runIsPrimeTest() {
    for (n in 1L..100)
        if (isPrime(n))
            print("$n ")
    println()
    println(if (isPrime(1_000_003)) "Asal" else "Asal değil")
}


fun isPrime(a: Long): Boolean {
    if(a <= 1)
        return false

    if(a % 2 == 0L)
        return a == 2L
    if(a % 3 == 0L)
        return a == 3L
    if(a % 5 == 0L)
        return a == 5L
    if(a % 7 == 0L)
        return a == 7L

    var i = 11
    while (i*i <= a) {
        if(a % i == 0L)
            return false
        i += 2
    }

    return true
}