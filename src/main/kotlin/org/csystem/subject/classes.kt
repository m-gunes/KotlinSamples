package org.csystem.subject


fun main() = runExamples()

fun runDevice() {
    val d = DeviceInfo()
    d.connect("192.167.56.23", 33000)
}
class DeviceInfo {
    fun connect(host: String, port: Int) {
        println("Connect to device on $host:$port")
    }
}

/*---------------------------------------------------------------------------------------------------------------------
Kotlin'de bir sınıfın ctor'ları temel olarak iki gruba ayrılabilir:
Primary ctor
Secondary ctor

Bir sınıfta primary ctor ya hiç olmayabilir ya da bir tanedir, secondary ctor ya hiç olmayabilir ya da herhangi sayıda olabilmektedir
---------------------------------------------------------------------------------------------------------------------*/

fun runSample() {
//    var s1 = Sample(3)
//    println("################################################")
//    var s2 = Sample(2.3)
//    println("################################################")
//    var s3 = Sample(10.toShort())


//    var s1 = Sample(10)
//    println("---------------------------")
//    var s2 = Sample(4.5)
//    println("---------------------------")
//    var s3 = Sample()
//    println("---------------------------")

//    val s = Sample()
//    println("--------------------------------")
//    val k = Sample(30)
//
//    println("s.a = ${s.a}")
//    println("k.a = ${k.a}")

//    var s = Sample()
//    println("--------------------------")
//    var k = Sample(10)
    // val s = Sample();
    // s.foo(10)
    val s = Sample();
    val a = 10

    //...
    // s.foo(a) // error: applicable function yok. Int parametreli foo fonksiyonunu kaldırildiginda hata olusur.
    // Eger s.foo(10) seklinde cagirilsaydi hata olmayacakti. Çünkü fonksiyon çağrısında argüman olarak verilen Int türden ifade bir sabit olduğundan Long türüne de doğrudan (implicit) dönüşebilir.

}

fun runExamples() {
   val s = Sample1()
    s.x = 10
    println("---------------------------------------------------")

    s.y = 3.4
    println("---------------------------------------------------")

    println("s.x = ${s.x}")
    println("---------------------------------------------------")
    println("s.y = ${s.y}")
    println("---------------------------------------------------")
    println(s.x * 2)
    println("---------------------------------------------------")
    ++s.x //s.x = s.x + 1
    println("---------------------------------------------------")
    println("s.x = ${s.x}")
    println("---------------------------------------------------")
    println("s.y = ${s.y}")
    println("---------------------------------------------------")


}


// Sınıfın public primary ctor'u
//class Sample(a: Int, b:Double) {}


//Sınıfın primary ctor'unun bildiriminde constructor anahtar sözcüğü kullanılabilir
//class Sample constructor(a: Int, b: Double) {}


// erişim belilrleyicisi yazılacaksa constructor anahtar sözcüğü zorunludur
//class Sample private constructor(a: Int, b: Double)


// primary constructor'ın parametreleri var veya val olarak bildirildiklerinde sınıfın property elemanları bildirilmiş olur.
// property elemanı doğrudan veri elemanı değildir.
// Property'nin aşağıdaki gibi kullanımı veri elemanı biçiminde düşünülebilir
// class Sample(var a: Int, val b: Double)


// Sınıfın property elemanları primary ctor içerisinde bildirilmişse erişim belirleyicisi de verilebilir.
// Şüphesiz default erişim belirleyici public'tir
//class Sample(var a: Int, private var b: Double)


// Sınıfın primary constructor'ının kodları init isimli bir blok içerisinde yazılabilir.
// init bloğu içerisinde primary constructor'ın parametrelerine veya primary constructor ile bildirilmiş property elemanlarına erişilebilir
/*
class Sample(var a: Int, private var b: Double = 0.0) {
    init {
        println("I am a primary ctor with values a = $a, b = $b")
    }
}
*/


// Sınıfın secondary ctor'u constructor anahtar sözcüğü ile bildirilir.
// Sınıfın secondary ctor'u overload edilebilir.
// primary ctor bir tanedir
/*
class Sample {
    constructor(a: Int) {
        println("I am a secondary ctor with parameter type: Int")
        println("a = $a")
    }

    constructor(a: Double) {
        println("I am a secondary ctor with parameter type: Double")
        println("a = $a")
    }
}
*/


// Sınıfın primary ctor'u varsa tüm secondary ctor'ların doğrudan ya da dolaylı olarak bu ctor'u çağırıyor olmaları gerekir.
// Bu işlem :this ctor sentaksı ile yapılır
/*
class Sample(a: Double) {

    init {
        println("------------------------------------------------------")
        println("I am a primary ctor with parameter type Double")
        println("------------------------------------------------------")
    }

    constructor(a: Short) : this(a.toInt()) {
        println("------------------------------------------------------")
        println("I am a secondary ctor with parameter type Short")
        println("------------------------------------------------------")
    }

    constructor(a: Int) : this(a.toDouble()) {
        println("------------------------------------------------------")
        println("I am a secondary ctor with parameter type Int")
        println("------------------------------------------------------")
    }
}

 */

// Aşağıdaki örnekte default ctor primary ctor yapılmıştır
/*
class Sample() {
    init {
        println("primary constructor")
    }

    constructor(b: Double) : this() {
        println("constructor(Double)")
    }

    constructor(b: Int) : this(b.toDouble()) {
        println("constructor(Int)")
    }
}

 */

// Aşağıdaki örneği inceleyiniz. Örnekte default constructor yazılmıştır.
// Dolayıysıyla secondary default ctor çağrılır (best match).
// Örnek için primary ctor'un parametresi için verilen default argüman artık kullanışsızdır
/*
class Sample(val a: Int = 10) {
    init {
        println("primary constructor: $a")
    }

    constructor() : this(20) {
        println("default constructor")
    }
}

 */


// primary ctor olmasa bile init bloğu yazılabilir. Bu durumda tüm ctor'ların başında bu blok çalıştırılır.
// Java'daki non-static initializer ile neredeyse aynı anlamdadır
/*
class Sample {
    init {
        println("init")
    }

    constructor() {
        println("default constructor")
    }

    constructor(a: Int) {
        println("Int constructor")
    }
}

 */


// Aşağıdaki örnekte Int, Float ve Long, Double parametreli foo fonksiyoları "uygun (applicable)" fonksiyonlardır.
// Çünkü fonksiyon çağrısında argüman olarak verilen Int türden ifade bir sabit olduğundan Long türüne de doğrudan (implicit) dönüşebilir.
// Örneği Int parametreli foo fonksiyonunu kaldırarak ayrıca gözlemleyiniz
class Sample {
//    fun foo(a: Int = 34, b: Float = 4.5F) = println("foo(Int, Float)")
    fun foo(a: Long = 0, b: Double = 4.5) = println("foo(Long, Double)")
    fun foo() = println("foo()")
}

class Sample1 {
    var x: Int = 0
        set(value) {
            println("SetX")
            field = value
        }
        get() {
            println("GetX")
            return field
        }

    var y: Double = 0.0
        set(value) {
            println("SetY")
            field = value
        }
        get() {
            println("GetY")
            return field
        }
}