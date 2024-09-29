package org.csystem.subject

fun main() = exampleOfIntAndLong()

fun exampleOfIntAndLong() {
    val a: Int = 10
    val b: Long = 456
    val c = a + b // a.plus(b)
    val d = b + a //b.plus(a)

    println(c.javaClass.name)

    println("c = $c")
    println("d = $d")


    val e: Int = 2_000_000_000
    val g: Int = 2_000_000_000
    // val h = e + g // This operation has led to an overflow
    val h = e.toLong() + g

    println("h = $h")

}

fun exampleOfInt() {
    // val a: Double = 4_000_000_000.456
    // val b: Int = a.toInt()
    // val c: Int = 4_000_000_000.toInt()
    // val d: Int = Int.MAX_VALUE

    // println("a = $a")
    // println("b = $b")
    // println("c = $c")
    // println("d = $d")
    val a: Double = -4_000_000_000.456
    val b: Int = a.toInt()
    val c: Int = (-4_000_000_000).toInt()
    val d: Int = Int.MIN_VALUE

    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("d = $d")
}

fun exampleOfRealNumbers() {
    /*
    *  Bu anlamda bu 3 tür için toInt fonksiyonu çağrılarak Int türüne dönüştürme yapıp
    *  sonradan ilgili türlere dönüştürecek fonksiyonların çağrılması gerekir.
    *  Bu anlamda gerçek sayı türlerinden tamsayı türlerine dönüşüm ya Int türüne ya da Long türüne yapılabilmektedir.
    * */
    while (true) {
        print("Enter a number:")
        val a = readln().toDouble();
//        val b: Byte = a.toByte();
//        val c: Short = a.toShort();
//        val d: Char = a.toChar();
        val e = a.toInt()
        println("e = $e")
    }
}

fun exampleOfByteAndChar() {
    while (true) {
        print("Bir sayı giriniz:")
        val a = readln().toByte()
        val b: Char = a.toInt().toChar() //a.toChar() deprecated

        println("a = %d".format(a))
        println("a = %02X".format(a))
        println("b = %c".format(b))
        println("b = %02X".format(b.code.toShort()))

        if (a.toInt() == 0)
            break
    }
}


fun exampleOfLongToInt() {

    while (true) {
        print("Enter a number:")
        val a = readln().toLong();
        val b: Int = a.toInt();

        println("a = %d".format(a))
        println("a = %016X".format(a))

        println("b = %d".format(b))
        println("b = %08X".format(b))
        if(a == 0L)
            break
    }
}

fun exampleOfChar() {
    val ch : Char = 67.toChar()
    println("ch = $ch");
    5.5.toChar()
    val ch1 = 'D'
    val ch2 = 'd'
    // val ch3 = ch1 + ch2 // Error

    // İki Char birbirinden çıkartılabilir. Bu durumda sonuç Int türden elde edilir.
    // Bu bize iki karakterin karakter tablosundaki sıra numarası farkını verir.
    // Şüphesiz yine bu işlem Char sınıfının Char parametreli minus operatör fonksiyonu ile yapılmaktadır
    val result = ch1 - ch2 //
    println("result type : ${result.javaClass.name}") // Bu degiskenin turunuu gosteriyor
    println("result = $result")

    // Char türü ile Int türünün toplanması durumunda sonuç Char türden çıkar.
    // Şüphesiz bu işlem Char sınıfının Int parametreli plus fonksiyonu ile yapılmaktadır
    val chr = ch1 + 32
    println("chr type: ${chr.javaClass.name}")
    println("chr = $chr") // sonuc d. ASCII tablosunda buyuk haflerle kucuk harfler arasindaki fark 32.


    // Aşağıdaki örnekte Int sınıfının Char parametreli plus fonksiyonu olmadığından error oluşur
    // val chi = 32 + ch1 // Error
}

fun exampleToByte() {
    while (true) {
        print("Input a number:")
        val a = readln().toByte()

        if(a == 0.toByte())
            break

        val b = a.toInt()
        println("a = %d".format(a))
        println("a = 0x%02X".format(a))

        println("b = %d".format(b))
        println("b = 0x%08X".format(b))
    }
}
fun exampleToShort() {
    while (true) {
        print("Input a number:")
        val a = readln().toShort()

        if(a == 0.toShort())
            break

        val b = a.toInt()
        println("a = %d".format(a))
        println("a = 0x%04X".format(a)) // a: short (2 byte) => 16'lik sistemdeki her digit, 2'lik sistemdeki 4 bit (1 Nibble) alan ile ifade edelebilir.
        // Yani buradaki %04X ifadesinin sebebi: short(2byte) ve bu 16'lik sistemde 4 digit ile ifade edilir

        println("b = %d".format(b))
        println("b = 0x%08X".format(b))
    }
}
fun examples() {
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
