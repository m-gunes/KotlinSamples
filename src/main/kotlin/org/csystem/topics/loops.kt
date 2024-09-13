package org.csystem.topics

fun main() = rageUntil()

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


fun forDownTo(){
    // downTo infix fonksiyonu ile for döngüsü içerisinde ters sırada dönen bir döngü yazılabilir
    print("Input first number:")
    val a = readln().toInt()

    print("Input second number:")
    val b = readln().toInt()

    for (i in b downTo a )
        print("$i ")
}

fun forDownToAndStep(){
    // Aşağıdaki örnekte downTo ve step fonksiyonları birlikte kullanılmıştır
    print("Input first number:")
    val a = readln().toInt()

    print("Input second number:")
    val b = readln().toInt()

    for (i in b downTo a  step 2)
        print("$i ")
}

fun forUntilUsage() {
    // until infix fonksiyonu ile [a, b) aralığında döngü deyimi oluşturulabilir
    print("Input first number:")
    val a = readln().toInt()

    print("Input second number:")
    val b = readln().toInt()

    for(i in a until b)
        print("$i ")
}


fun forUntilAndStepUsage() {
    // until infix fonksiyonu ile step fonksiyonunun kullanımı
    print("Input first number:")
    val a = readln().toInt()

    print("Input second number:")
    val b = readln().toInt()

    for(i in a until b step 2)
        print("$i ")
}


fun notCorrectStep() {
    // Aşağıdaki örnekte exception oluşur. step'e verilen argüman pozitif bir değer olmalıdır. Buradaki örnek geriye doğru dolaşmak anlamına gelmez
    val a = 10
    val b = 1

    for (i in a..b step -1)
        print("$i ")

    println()
}

fun rageUntil() {
    print("Input first number:")
    val a = readln().toInt()

    print("Input second number:")
    val b = readln().toInt()

    for(i in a..<b)
        print("$i ")
}