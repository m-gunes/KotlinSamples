package org.csystem.subject

/*---------------------------------------------------------------------------------------------------------------------
    Kotlin'de referans türleri için == ve != operatörlerinin operatör fonksiyonu Any sınıfından equals metodudur.
    Yani aslında eşitlik karşılaştırması equals metodu çağrılarak yapılır. Any sınıfının equals metodu referans karşılaştırması yapar.
    Ancak sınıfta equals metodu override edilmişse bu durumda referans karşılaştırması yapılmaz.
    Bu durumda programcı referans karşılaştırması için bu operatörleri kullanılırsa bu işlem garanti olmayabilir.

    data sınıflarının equals metodu içerisinde property elemanlarını == işlemine sokacak şekilde otomatik olarak
    override edildiğinden örnekte == operatörü true değer üretir. Yani artık referans karşılaştırması yapmaz.

    Kotlin'de referans karşılaştırmasının kesin olarak yapılabilmesi için iki tane ek eşitlik karşılaştırma operatörleri bulunmaktadır:
    ===, !==
    Bu durumda programcı kesinlikle referans karşılaştırması yapmak istiyorsa bu operatörleri tercih etmelidir.


    Her ne kadar temel türler (yani temel türlere ilişkin sınıflar) için de ===, !== operatörleri kullanılabilse de
    anlamsız bir durum oluştuğundan bu operatörlerin temel türler için kullanımı deprecated olmuştur
---------------------------------------------------------------------------------------------------------------------*/

fun main() {
    val s = Sample6(10)
    val k = Sample6(10)

    println(if(s == k) "Aynı nesne" else "Farklı nesneler")
    println()

    val ds = Sample7(10)
    val dk = Sample7(10)

    println(if(ds == dk) "Aynı nesne" else "Farklı nesneler")
    println(if(ds === dk) "Aynı nesne" else "Farklı nesneler")
    println(if(ds !== dk) "Farklı nesneler" else "Aynı nesne")

}


class Sample6(var value: Int)
data class Sample7(var value: Int)
