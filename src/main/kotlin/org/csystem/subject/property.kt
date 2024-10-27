package org.csystem.subject

import kotlin.math.PI
import kotlin.math.abs


/*---------------------------------------------------------------------------------------------------------------------
    Bir property elemanının set bölümü ona atama yapıldığında çalışır. get bölümü ise değeri kullanılmak istendiğinde çalışır.
    Bir property elemanı için genel olarak arka planda yaratılan bir veri elemanı (backing field) bulunmaktadır.
    Property elemanı içerisinde, ilişkin olduğu veri elemanına erişmek için field bağlamsal anahtar sözcüğü (contextual keyword) kullanılabilir.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runCircleTest()

fun runCircleTest() {
    val c = Circle(-3.4)

    println(c.area)
    println(c.circumference)
    println("------------------------------")

    c.radius = -4.4
    println(c.area)
    println(c.circumference)
    println("------------------------------")

}

class Circle(radius: Double = 0.0) {
    var radius: Double = abs(radius)
        set(value) {
            field = abs(value)
        }

    val area: Double
        get() = PI * radius * radius

    val circumference: Double
        get() = 2 * PI * radius
}

class Circle2(var radius: Double = 0.0) {
    var r: Double = abs(radius)
        set(value) { // backing field yani set kısmı gereksizdir
            field = abs(value)
            area = PI * field * field
            circumference = 2 * PI * field
        }

    var area: Double = PI * r * r
        private set
        get() = PI * r * r

    var circumference: Double = 2 * PI * r
        private set
        get() = 2 * PI * r

}

fun runCircle1Test() {
    val c = Circle1(-3.9)
    println(c.radius)
    c.radius = 3.4 // radius değeri yalnızca ctor içerisinde kontrol edilmiştir. Atama durumunda kontrol işlemi yazılmamıştır Bu anlamda Circle sınıfı iyi olarak tasarlanmamıştır
    println(c.radius)
    c.radius = -3.7 // Dikkat pozitif yapılmıyor
    println(c.radius)
}

class Circle1(var radius: Double) {
    init {
        radius = abs(radius)
    }
}

fun runSample5Test() {
    val s = Sample5();
    // s.x = 23 // Error: Val cannot be reassigned
    println(s.x)
}

class Sample5 {
    val x: Int // ilkdeğer (initialization) verilmediği için tüm ctor'larda değer verilmek zorundadır
    val y: Int = 10 // val olarak bildirilmiş `y` property elemanı için ilkdeğer verildiğinden ctor'lar içerisinde (aslında hiç bir yerde) değer verilemez.
    val z: Int

    init {
        z = 0 // init bloğu içerisinde val olarak bildirilmiş `z` property elemanına değer verildiğinden artık ctor'lar içerisinde (aslında hiçbir yerde) değer verilemez
    }

    constructor(a: Int) {
        x = a
        // y = a // Error: Val cannot be reassigned
        // z = a // Error: Val cannot be reassigned
    }

    constructor(): this(0) {
    }
}

fun runSample4Test() {
    val s = Sample4()
    // s.x = 23 // Error
    println(s.x)
}

class Sample4 {
    var x: Int = 0
        private set

    var y: Int
    var z: Double = 0.0
        set(value) {
            //..
            field = value // backing field
        }

    init {
        y = 20
        x = 34
    }
    fun foo(a: Int) {
        x = a
    }
}



fun runSample3Test() {
    val s = Sample3()
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


class Sample3 {
    var x: Int = 0
        set(value) {
            println("setX")
            field = value // field: x property si icin arka planda yaratılan bir veri elemanına (backing field)'a karsilik geliyor.
        }
        get() {
            println("getX")
            return field
        }

    var y: Double = 0.0
        set(value) {
            println("setY")
            field = value
        }
        get() {
            println("getY")
            return field
        }
}