package org.csystem.casestudies

import kotlin.math.abs

/*---------------------------------------------------------------------------------------------------------------------
Sınıf Çalışması: Parametresi ile aldığı 3 basamaklı Int türden bir sayının basamakları toplamını döndüren sum3Digits
fonksiyonunu ve test kodunu yazınız.

Açıklamalar:
    Fonksiyon basamak sayısı kontrolü yapmayacaktır.
    Sayı negatif ise sonuç pozitif olarak elde edilecektir
---------------------------------------------------------------------------------------------------------------------*/
fun main() = runSum3DigitsTest()

fun runSum3DigitsTest() {
    println("Input a 3 digit number")
    val value = readln().toInt()
    println("The sum of the digits of the number ${value} is ${sum3Digits(value)} ")
    println("2. The sum of the digits of the number ${value} is ${sum3Digits2(value)} ")
}

fun sum3Digits(value: Int): Int {
    val a = value / 100
    val b = value / 10 % 10
    val c = value % 10
    return abs(a + b + c)
}

// Another solution to the problem using the operator function
fun sum3Digits2(value: Int): Int {
    val a = value.div(100)
    val b = value.div(10).rem(10)
    val c = value.rem(10)

    return abs(a + b + c)
}
