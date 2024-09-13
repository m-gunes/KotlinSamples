package org.csystem.casestudies

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı Int türden bir n sayısı için n-inci asal sayıyı döndüren getPrime isimli
    fonksiyonu yazınız ve aşağıdaki kod ile test ediniz.
    Açıklamalar: Fonksiyon n'nin pozitif olmayan değerleri için kontrol yapmayacaktır.
                 Fonksiyonu isPrime fonksiyonunun etkinliğini düşünerek yazınız
---------------------------------------------------------------------------------------------------------------------*/
fun main() = runGetPrimeTest()

fun runGetPrimeTest() {
    while (true) {
        print("Bir sayı giriniz:")
        val n = readln().toInt()

        if (n <= 0)
            break

        println("${n}. asal sayı: ${getPrime(n)}")
    }

    println("Tekrar yapıyor musunuz?")
}

fun getPrime(n: Int): Long {
    var count = 0
    var a = 2L

    while (true) {
        if(isPrime(a))
            ++count

        if(count == n)
            return a
        ++a
    }
}
