package org.csystem.coursework

import kotlin.math.abs

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması:
        Parametresi ile aldığı Int türden bir sayının basamakları toplamını döndüren sumDigits fonksiyonunu yazınız
        ve aşağıdaki kod ile test ediniz.
        Açıklama: Fonksiyon negatif sayılar için de pozitif değere geri dönecektir
---------------------------------------------------------------------------------------------------------------------*/


fun main() = runSumDigitsTest()

fun runSumDigitsTest() {
    while (true) {
        print("Input a number: ")
        val value = readln().toInt()
        if(value == 0)
            break
        println("The sum of the digits of the number $value is ${sumDigits(value)} ")
    }
}
fun sumDigits(a: Int): Int {
    var temp = a
    var total = 0
    while (temp != 0) {
        total += temp % 10
        temp /= 10
    }
   return abs(total)
}
