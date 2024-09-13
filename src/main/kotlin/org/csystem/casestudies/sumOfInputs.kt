package org.csystem.casestudies


/*---------------------------------------------------------------------------------------------------------------------
Sınıf Çalışması: Klavyeden sıfır girilene kadar alınan sayıların toplamını bulan programı yazınız.
Örnekte break deyimini kullanabilirsiniz.
---------------------------------------------------------------------------------------------------------------------*/
fun main() = sumOfInputs()


fun sumOfInputs() {
    println("Let's start enter a numbers:")
    var total = 0

    while (true) {
        val a = readln().toInt()
        if(a == 0)
            break
        total += a
    }
    println("total = $total")
}