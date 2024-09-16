package org.csystem.topics

fun main() {
    // Kotlin'de genel olarak farklı türler birbirine doğrudan (implicit) atanamaz
    var a = 10
    var b:Long
//    b = a // Error

    // Aşağıdaki örnekte istisna bir durum vardır. Int türden bir sabit Long türüne doğrudan atanabilir veya ilkdeğer olarak verilebilir.
    var c: Long = 10

    // Kotlin'de de Java' da olduğu gibi Byte ve Short türden sabit yoktur ancak sınırlar içerisinde kalması koşuluyla
    // Int türden bir sabit Byte veya Short türüne doğrudan atanabilir.
    var d: Short = 10
//    d = 10L //error: Sabit long türden
//    d = 40000 //error: Short türünün sınırları dışında


    // Yukarıdaki istisna durum Java'da char türü için de vardır. Ancak Kotlin'de Char türü için bu durum geçersizdir.
//    var e:Char = 67 // Error


    // Temel türlere ilişkin sınıfların toXXX fonksiyonları ile birbirlerine dönüşümleri sağlanabilir.

    var e = 10
    var f: Long = e.toLong()
    println("f = $f")

    while (true) {
        print("Bir sayı giriniz:")
        val a = readln().toShort()

        if (a == 0.toShort())
            break

        val b = a.toInt()

        println("a = %d".format(a))
        println("a = 0x%04X".format(a))
        println("b = %d".format(b))
        println("b = 0x%08X".format(b))
    }

    while (true) {
        print("Bir sayı giriniz:")
        val a = readln().toByte()

        if (a == 0.toByte())
            break

        val b = a.toInt()

        println("a = %d".format(a))
        println("a = 0x%02X".format(a))
        println("b = %d".format(b))
        println("b = 0x%08X".format(b))
    }


}
