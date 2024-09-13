package org.csystem.casestudies

fun main() {
    println(if (isPrimeWithCount(1_000_003)) "Asal" else "Asal değil")
    println(if (isPrimeSlowWithCount(1_000_003)) "Asal" else "Asal değil")
}

fun isPrimeSlowWithCount(a: Long): Boolean {
    if (a <= 1)
        return false

    val halfValue = a / 2

    var count = 0

    for (i in 2..halfValue) {
        ++count
        if (a % i == 0L)
            return false
    }

    println("isPrimeSlow:count=$count")
    return true
}

fun isPrimeWithCount(a: Long): Boolean {
    if (a <= 1)
        return false

    if (a % 2 == 0L)
        return a == 2L

    if (a % 3 == 0L)
        return a == 3L

    if (a % 5 == 0L)
        return a == 5L

    if (a % 7 == 0L)
        return a == 7L

    var i = 11L

    var count = 0L

    while (i * i <= a) {
        ++count
        if (a % i == 0L)
            return false

        i += 2
    }

    println("isPrime:count = $count")

    return true
}


/*---------------------------------------------------------------------------------------------------------------------
Yukarıdaki isPrime fonksiyonlarını, özellikle hızlı versiyonunu aşağıdaki sayılar ile test ediniz ve sonuçları gözlemleyiniz:

6750161072220585911
1603318868174368979
6584583408148485263
6245098347044246839
6285871677077738093
5697859706174583067
710584055392819667
4935060337471977161
3728803592870153407
4331452335614730577
1386437196678024971
1677990107453991593
4765603950744460867
4498306523077899307
4434895834573449257
---------------------------------------------------------------------------------------------------------------------*/