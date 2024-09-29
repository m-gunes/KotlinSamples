package org.csystem.subject

/*---------------------------------------------------------------------------------------------------------------------
    Kotlin'de switch deyimi yoktur. Ancak benzer şekilde kullanılabilecek when ifadesi (when expression) vardır.
    Java 14 ile birlikte switch'in ifade olarak kullanımı da Java'ya eklenmiştir (switch expression).
    Bu anlamda switch de artık ifadesel deyim olarak kullanılabilir.
    switch expression, when expression'a oldukça benzemektedir

    when ifadesinde aşağı düşme (fall through) özelliği yoktur.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = whenWithIn()

fun phoneCode() {
    print("Input a city phone code: ")
    var code = readln().toInt()
    return when(code) {
        212, 216 -> println("Istanbul")
        312 -> println("Ankara")
        372 -> println("Zonguldak")
        else -> println("Invalid phone code...")
    }
}

fun whenUsage() {
    print("Input a number: ")
    val a = readln().toInt()

    // when ifadesinin parantezsiz kullanımı. Bu kullanımda koşulların -> atomundan önce yazıldığına dikkat ediniz. Java'da switch bu şekilde kullanılamaz
//    when {
//        a > 0 -> println("Positive")
//        a < 0 -> println("Negative")
//        else -> println("Zero")
//    }


    // when ifadesinin ürettiği değerin kullanılması. when ifadesinin değer üretmesi durumunda else kısmı olmalıdır
    val message = when {
        a > 0 -> "Positive"
        a < 0 -> "Negative"
        else -> "Zero"
    }
    println(message)

    println(when {
        a > 0 -> "Positive!"
        a < 0 -> "Negative!"
        else -> "Zero!"
    })

}

/*---------------------------------------------------------------------------------------------------------------------
    when ifadesinin in ve !in (not in) operatörleri ile kullanımı. in ve !in operatörleri ileride ele alınacaktır
---------------------------------------------------------------------------------------------------------------------*/


fun whenWithIn() {
    print("Input a number: ")
    val value = readln().toInt()

    when (value) {
        in 10..20 -> println("10 <= $value <= 20")
        !in 1..3 -> println("$value < 1 || $value > 3")
        else -> println("Invalid value...")
    }
}


/*---------------------------------------------------------------------------------------------------------------------

Question????
How could be possible -> when (val value = readln().toInt())
while ile bunu yapamiyorsunuz. when ile oluyor.

Not: while döngü deyiminin parantezi içerisinde atama yapılması geçersizdir.
Anımsanacağı gibi atama operatörü bir ifade oluşturmaz. Dolayısıyla değer üretmez

fun whenWithIn() {
    print("Input a number: ")
    when (val value = readln().toInt()) {
        in 10..20 -> println("10 <= $value <= 20")
        !in 1..3 -> println("$value < 1 || $value > 3")
        else -> println("Invalid value...")
    }
}
---------------------------------------------------------------------------------------------------------------------*/

