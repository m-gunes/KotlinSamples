package org.csystem.topics

fun main() = forWithStep()

fun classicWhile() {
    // Kontrolün başta yapıldığı while döngüsü
    print("Input a number:")
    val a = readln().toInt()
    var i = 0

    while (i < a) {
        print("$i ")
        ++i
    }
}


fun assignmentOperator() {
    // while döngü deyiminin parantezi içerisinde atama yapılması geçersizdir.
    // Anımsanacağı gibi atama operatörü bir ifade oluşturmaz. Dolayısıyla değer üretmez
    var a: Int
    var count = 0
//    while((a = readln().toInt()) != 0) // Error: Assignments are not expressions
        ++count

    println("counnt= $count")
}

fun nTimes() {
    //while döngü deyimi ile n-kez dönen döngü kalıbı
    print("Input a number:")
    var n = readln().toInt()
    while(n-- > 0)
        print("$n ")

    println()
    println("After loop, n is $n")
}


fun differentWhile() {
    // do-while döngü deyiminde Java ve C#'dan farklı olarak do-while döngü deyimi içerisinde
    // bildirilmiş olan bir değişkenin while parantezi içerisinde kullanımı geçerlidir
    do {
        val a = readln().toInt()
        println("a = $a")
    } while (a != 0)
}


fun enhancedFor() {
    for(i in 1..10)  //[1, 10]
        print("$i ")

    println("Input a number: ")
    val n = readln().toInt()
    for(i in 1..n) // [1, n]
        print("$i ")

}

fun minMaxFor() {
    print("Input a min value: ")
    val min = readln().toInt()

    print("Input a max value: ")
    val max = readln().toInt()

    for(i in min..max)
        print("$i ")
}

fun notExistFor() {
    for(i in 10..1) // it doesn't work
        print("$i ")
}

fun forWithStep() {
    print("Input a number: ")
    val n = readln().toInt()
    for(i in 1..n step 2) // step 2 => i += 2
        print("$i ")

}