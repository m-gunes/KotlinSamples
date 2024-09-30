package org.csystem.casestudies

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan Int türden sayıların ortalamasını bulup ekrana yazdıran programı yazınız.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runAverageApplication()

fun runAverageApplication() {
    var total = 0L
    var count = 0

    while (true) {
        print("Enter a number: ")
        val a = readln().toInt()
        if(a == 0)
            break
        total += a
        ++count
    }
    println("Average = ${total.toDouble() /count} ")
}
