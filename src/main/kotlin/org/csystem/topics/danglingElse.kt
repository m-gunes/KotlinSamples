package org.csystem.topics

fun main() = runMax()

// Aşağıdaki örnekte else içteki if deyimine ilişkindir (dangling else)
fun danglingElse() {
    println("Input a number?")
    val a = readln().toInt()
    if(a % 2 == 0)
        if(a > 0)
            println("Even")
        else
            println("Odd")
}

// Yukarıdaki problem bileşik deyim (blok) konarak çözülebilir
fun danglingElseSolved() {
    println("Input a number?")
    val a = readln().toInt()
    if(a % 2 == 0) {
        if(a > 0)
            println("Even")
    } else
        println("Odd")
}

fun danglingElseSolved2() {
    println("Input a number?")
    val a = readln().toInt()
    if(a % 2 == 0)
        if(a > 0)
            println("Even and positive")
        else
            println("Even and negative")
    else
        println("Odd")
}


// Aşağıdaki örnekte if ifadesel deyimi ifade biçiminde koşul operatörü(Conditional/Ternary operator) gibi kullanılmıştır
fun max(a: Int, b: Int) = if(a > b) a else b

fun runMax() {
    print("Input a number:")
    val a = readln().toInt()
    print("Input other number:")
    val b = readln().toInt()
    println("max($a, $b) = ${max(a, b)}")
}