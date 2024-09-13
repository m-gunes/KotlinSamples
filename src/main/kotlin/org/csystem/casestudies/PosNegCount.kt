package org.csystem.casestudies

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayılardan pozitif ve negatif olanlarının ayrı ayrı
    toplamlarını ve kaçar tane olduklarını bulan programı yazınız.
    Not: Örnek Kotlin'de şu ana kadar görülen konular kullanılarak yazılmıştır.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runPosNegCountApp()

fun runPosNegCountApp() {
    var posCount = 0
    var negCount = 0
    var posTotal = 0
    var negTotal = 0

    while (true)  {
        print("Bir sayı giriniz:")
        val a = readln().toInt()
        if(a == 0)
            break

        if(a > 0) {
            ++posCount
            posTotal += a
        } else {
            ++negCount
            negTotal += a
        }
    }

    printResult(posCount, negCount, posTotal, negTotal)
}

fun printResult(posCount: Int, negCount: Int, posTotal: Int = 0, negTotal: Int) {
    if (posCount > 0)
        println("$posCount adet pozitif sayı girdiniz. Toplamları:$posTotal")
    else
        println("Hiç pozitif sayı girmediniz")

    if (negCount > 0)
        println("$negCount adet pozitif sayı girdiniz. Toplamları:$negTotal")
    else
        println("Hiç negatif sayı girmediniz")
}
