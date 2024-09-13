package org.csystem.casestudies

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması:
        Parametresi ile aldığı a ve b Int türden değerleri için a nın b-inci kuvvetini döndüren pow fonksiyonunu yazınız
        ve aşağıdaki kod ile test ediniz.

    Açıklama:
        Math sınıfının pow metodu veya Kotlin kütüphanesindeki pow fonksiyonu kullanılmayacaktır.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runPowTest()
fun runPowTest() {

    while (true) {
        print("Tabani giriniz: ")
        val a = readln().toInt()

        if(a == 0)
            break

        print("Ussu giriniz: ")
        val b = readln().toInt()

        println("pow($a, $b) = ${pow(a, b)}")
    }

}

fun pow(a: Int, b: Int): Int {

    var result = 1
    for(i in 1..b)
        result *=a

    return result
}

fun powW(a: Int, b: Int): Int {
    var result = 1
    var n = b

    while(n-- > 0)
        result *= a

    return result
}
