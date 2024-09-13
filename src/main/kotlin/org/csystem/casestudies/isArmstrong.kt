package org.csystem.casestudies

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı bir sayının basamaklarının basamak sayıncı kuvvetleri toplamının
    kendisine eşit olup olmadığını test eden isArmstrong isimli fonksiyonu yazınız ve aşağıdaki kod ile test ediniz.
    Fonksiyon negatif değerler için false değerini döndürecektir.

    Açıklama: Kuvvet alma işlemi için bir önceki örnekte yazılan pow fonksiyonu kullanılacaktır.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runIsArmstongTest()

fun runIsArmstongTest() {
    for(a in -10..99999)
        if(isArmstrong(a))
            println(a)
}

fun isArmstrong(a:Int): Boolean {
    fun digitsPowSum(): Int {
        var temp = a
        val n = countDigits(a)
        var result = 0;

        while (temp != 0) {
            result += pow(temp % 10, n)
            temp /= 10
        }

        return result
    }
    return digitsPowSum() == a
}


// Version 2

fun isArmstrong2(a:Int): Boolean = digitsPowSum2(a) == a

fun digitsPowSum2(a: Int): Int {
    var temp = a
    val n = countDigits(a)
    var result = 0;

    while (temp != 0) {
        result += pow(temp % 10, n)
        temp /= 10
    }

    return result
}
