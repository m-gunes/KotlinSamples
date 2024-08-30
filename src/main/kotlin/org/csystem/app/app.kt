package org.csystem.app

import kotlin.math.sqrt

// Fonksiyon cagirilirken isimli argumanlar verilebilir. Named argument. Argumanlarin verilis sirasinin onemi kalmiyor
// Fonksiyonlar default arguman alabiliyor. Bir fonksiyonun parametresinin default argumani olabiliyor.
// İsimli argümanların default argüman alan metotlarda kullanımına çok sık rastalanır. Zaten çoğu zaman da isimli argüman kullanımı default argümanlar ile anlamlıdır

fun main() {
//    sum3DigitsTest();





//    var a: Int = 5
//    var b: Int = 8
//    var sum = a + b
//    println("sum = $sum")
////    sum = sum.plus(5)
//    sum = a.plus(b)
//    println("sum = $sum")




//    print("Input a number:")
//    val a: Int = readln().toInt()
//    println(isEven(a))
//    println(isOdd(a))
//    bar(5, 6.7)

//    println(add(5))
//    println(add(5, 6))
//    println(add())
//    println(sqrt(5.0))

//    display(5, 5.5)
//    display(b=5.7, a=7) // named argument, isimli argumanlar
//
//    fos()
//    tar(1)

    print("bir sayi giriniz")
    var value = readln().toInt()
}



fun sum3DigitsTest(){
    print("3 basamakli bir sayi giriniz:")
    val value = readln().toInt();
    println("$value basmakelari toplami: ${sum3Digits(value)}")
}

fun sum3Digits(value: Int): Int {
    val a = value / 100
    val b = value / 10 % 10
    val c = value % 10
    return a + b + c
}
fun fos(a: Int = 0) = println("a = $a")
fun fos() = println("fos")


// Tek bir ifade içeren fonksiyonlar (single expression functions) için gövde yazmaya gerek yoktur.
// Tek ifadeli fonksiyonlar için geri dönüş değeri bilgisi yazılmayabilir
fun isEven(a:Int) = a % 2 == 0
fun isOdd(a:Int): Boolean = !isEven(a)

fun add(a: Int=0, b: Int=0) = a + b
fun display(a: Int, b: Double) = println("a = $a, b = $b")
fun display(a: Int = 67, b: Double = 0.1, c: Char = 'C') = println("a = $a, b = $b, c = $c")
fun beyondPrint(a: Int = 10, b: Int = 20, c: Int = 30) = println("a = $a, b = $b, c = $c")

fun foo(a: Int){
    fun mod(x: Int, y: Int) = x % y
    fun isEven() = mod(a, 2) == 0 // a % 2 == 0
    if(isEven())
        println("even")

    fun bar() {
        println("bar")
    }

    bar()

    // Fonksiyonların parametre değişkenlerinin fonksiyon içerisinde değerin değiştirilmesi geçersizdir
//    a *= 2 // val cannot be reassigned
//    println(a)
}

fun bar(a:Int, b: Double){
    var a = a
    var b = b
    a *= 2;
    b -= 5;
    println("a = $a, b = $b")
}

fun tar(a:Int){
    var temp = a;
    fun isEven() = ++temp % 2 == 0

    println("temp = $temp")

    if(isEven())
        println("temp = $temp || even")
    else
        println("temp = $temp || odd")


    if(isEven())
        println("temp = $temp || even")
    else
        println("temp = $temp || odd")

}