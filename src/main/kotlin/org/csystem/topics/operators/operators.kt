package org.csystem.topics.operators

/*
Kotlin'de her operatörün karşılık geldiği bir fonksiyon bulunmaktadır.
Bu şekilde tasarım ilgili fonksiyonun olduğu türlere ilişkin değerlerin o operatörle kullanılabilmesi anlamına gelir.
* */




fun main() {
    // Kotlin'de koşul operatörü (conditional operator) yoktur.
    println("Input a number:")
    var a = readln().toInt()
    println(if(a % 2 == 0) "even" else "odd")

}

fun assignment() {
    val a: Int
    val b: Int
    val c: Int = 10
    // a = b = c // Error
}

fun foo() : Boolean {
    println("foo")

    return true
}

fun bar() : Boolean {
    println("bar")

    return false
}
fun tar(): Boolean {
    println("tar")

    return false
}

fun plus() {
    //Aritmetik + operatörü ve plus fonksiyonu
    val a: Int = 10
    val b: Int = 20
    var sum: Int = a + b
    println("sum = $sum")

    sum = a.plus(b)
    println("sum = $sum")
}

fun times(){
    // Aritmetik * operatörü ve times fonksiyonu
    val a:Int = 10
    val b:Int = 20
    var result: Int = a * b
    println("result = $result")

    result = a.times(b)
    println("result = $result")
}

fun minus() {
    // Aritmetik - operatörü ve minus fonksiyonu
    val a:Int = 20
    val b:Int = 10

    var result: Int = a - b
    println("result = $result")

    result = a.minus(b)
    println("result = $result")
}

fun div() {
    //  Aritmetik / operatörü ve div fonksiyonu
    val a:Int = 20
    val b:Int = 10
    var result: Int = a / b
    println("result = $result")

    result = a.div(b)
    println("result = $result")
}

fun mod() {
    // Mod operatörünün birinci operandı negatif ise sonuç her zaman negatif çıkar.
    // Yani mod operatörünün ürettiği değerin işareti birinci operandının işareti ile aynıdır
    // Aritmetik % operatörü ve rem fonksiyonu

    print("Input a number:")
    val a = readln().toInt()

    print("Input another number:")
    val b = readln().toInt()

    println("a % b = ${a % b}")
    println("a.rem(b) = ${a.rem(b)}")
    println("$a % $b = ${a.mod(b)}") // Matematikteki mod işlemine karşılık geliyor
}

fun unaryMinus() {
    // İşaret - operatörü ve unaryMinus fonksiyonu
    print("Input a number:")
    val a = readln().toInt()
    var b = -a
    println("b = $b")
    b = a.unaryMinus()
    println("b = $b")
}

fun unaryPlus() {
    // İşaret + operatörü ve unaryPlus fonksiyonu
    print("Input a number:")
    val a = readln().toInt()
    var b = +a
    println("b = $b")
    b = a.unaryPlus()
    println("b = $b")
}


fun inc1() {
    // ++ operatörünün kullanımı nasıl olursa olsun değişkeni bir artırır
    var a = 10
    a++ // or ++a
    println("a = $a")

    var b = 10
    val c = b++
    println("b = $b") // ++b => b = 11 _____ b++ => b = 11
    println("c = $c") // ++b => c = 11 _____ b++ => c = 10
}

fun inc2() {
    // ++ operatörünün fonksiyon karşılığı olan inc fonksiyonu artırılmış değeri döndürür.
    // Temel türlere ilişkin sınıflar immutable olduğundan inc fonksiyonu artırma işlemini yapmaz.
    // Artırılmış değere geri döner
    val a : Int = 10
    val b = a.inc() //val b = a + 1

    println("a = $a")
    println("b = $b")
}

fun inc3() {
    // ++ operatörünün fonksiyon karşılığı
    var a = 10;
    a = a.inc(); // a = a + 1
    print("a = $a")
}

fun inc4() {
    // ++ operatörünün fonksiyon karşılığı
    var a = 10
    val b = a
    a = a.inc()

    println("a = $a")
    println("b = $b")
}

fun inc5() {
    // ++ operatörünün fonksiyon karşılığı
    var a = 10
    a = a.inc()
    val b = a

    println("a = $a")
    println("b = $b")
}

fun dec() {
    // `--` operatörünün fonksiyon karşılığı. dec fonksiyonu azaltılmış değeri döndürür.
    // Temel türlere ilişkin sınıflar immutable olduğundan dec fonksiyonu artırma işlemini yapmaz.
    // Artırılmış değere geri döner
    var a = 10
    val b = a.dec() //b = a - 1
    println("a = $a")
    println("b = $b")
}

fun dec1() {
    var a = 10
    a = a.dec() // a = a -1
    println("a = $a")
}
