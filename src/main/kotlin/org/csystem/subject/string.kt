package org.csystem.subject

import kotlin.random.Random

fun main() = checkEmailInput()

fun compareObject() {
    print("Input a number:")
    val s = readln()

    print("Input another number:")
    val k = readln()

    println(if (s === k) "Aynı nesne" else "Farklı nesneler") // Klavyeden String okunması durumunda elde edilen nesneler farklıdır

    println("-----------------")

    // Özdeş String atomları için aynı adres kullanılır
    val s1 = "ankara"
    val s2 = "ankara"

    println(s1 == s2)
    println(s1 != s2)
    println(s1 === s2)
    println(s1 !== s2)
}


fun compareTo() {
    print("Birinci yazıyı giriniz:")
    val s = readln()

    print("İkinci yazıyı giriniz:")
    val k = readln()

    println(s.compareTo(k))
    println(s.compareTo(k, true)) // String sınıfının compareTo metodunun ignoreCase parametresi ile büyük küçük harf duyarsız (case insensitive) karşılaştırma yapılabilir
}


fun compareString() {
    print("Birinci yazıyı giriniz:")
    val s = readln()

    print("İkinci yazıyı giriniz:")
    val k = readln()

    println(if (s == k) "Aynı yazı" else "Farklı yazılar") // İki yazının aynı olup olmadığı == veya != operatörleri ile test edilebilir
    println(if (s === k) "Aynı nesne" else "Farklı nesneler")

    println(if (s.equals(k, true)) "Aynı yazı" else "Farklı yazılar"); // İki yazının eşitliğinin case insensitive olarak karşılaştırılması
}


fun stringFunctions() {
    print("Input a string:")
    val s1 = readln()
    val s2 = s1.uppercase() // String sınıfının toUpperCase metodu Kotlin 1.5 ile birlikte deprecated olmuştur. Bu fonksiyon yerine upperCase fonksiyonu kullanılmalıdır
    val s3 = s2.lowercase() // String sınıfının toLowerCase metodu Kotlin 1.5 ile birlikte deprecated olmuştur. Bu fonksiyon yerine lowerCase fonksiyonu kullanılmalıdır

    println("s1 = $s1")
    println("s2 = $s2")
    println("s3 = $s3")


    println("---------------------")

    val st1 = "İyi bir Android programcısı olmak için çok çalışmak gerekir. Çok çok çalışmak gerekir"
    val st2 = "Çok"
    val st3 = "çok"
    println(st1.indexOf(st2))
    println(st1.indexOf(st2, 62))
    println(st1.indexOf(st2, 62, ignoreCase = true))
    println(st1.indexOf(st2, ignoreCase = true))

    println("last index of: ${st1.lastIndexOf(st2)}")
    println("last index of: ${st1.lastIndexOf(st3)}")
}


fun emptyBlank() {
    print("Bir yazı giriniz:")
    val s = readln()

    println(if (s.isBlank()) "Blank" else "Not blank")
    println(if (s.isEmpty()) "Empty" else "Not empty")
    println(if (s == "") "Empty" else "Not empty") // isEmpty fonksiyonu yerine: s == "" karşılaştırması kullanılabilir


    // Kotlin'e ait bazı sınıflarda isXXX metotlarının isNotXXX versiyonları da bulundurulur. Okunabilirlik açısından "mantıksal değil operatörü" ile isXXX çağırmak yerine isNotXXX çağrılmalıdır

    println(if (s.isNotBlank()) "Not blank" else "Blank") //println(if (!s.isBlank()) "Not blank" else "Blank")
    println(if (s.isNotEmpty()) "Not empty" else "Empty") //println(if (!s.isEmpty()) "Not empty" else "Empty")
    println(if (s != "") "Not Empty" else "Empty")
}


fun indexer() {
    print("Input a string:")
    val s = readln()
    for (i in 0..<s.length)
        print("${s[i]} ") // String sınıfının indexer elemanı ile yazının bir indeksteki karakteri elde edilebilir. indexer elemanı aslında [] operatör fonksiyonudur.

    println()

    for (c in s) // String sınıfının tüm karakterleri for döngüsü ile elde edilebilir. Yani String sınıfı "iterable"'dır.
        print("$c ")

    println()

    for (i in s.indices) // String sınıfına ilişkin indeks değerleri indices property elemanı ile elde edilbilir.
        print("${s[i]} ")
}

fun runGenerateRandomTextENTest() {
    while (true) {
        print("Input count:")
        val count = readln().toInt()
        if (count <= 0)
            break

        val text = generateRandomTextEN(count)
        println(text)
    }
}

fun generateRandomTextEN(count: Int, random: Random = Random): String {
    val sb = StringBuilder(count)

    for (i in 1..count)
        sb.append(if (random.nextBoolean()) 'A' else 'a' + random.nextInt(26)) // char + int => char verir. Ex: 'A'.plus(1) => 'B'

    return sb.toString()
}


fun runReverseTest() {
    while (true) {
        print("Input text:")
        val s = readln()
        if (s == "exit")
            break

        println(reverse(s))
    }
}

fun reverse(s: String) = StringBuilder(s).reverse().toString()



///// Char türünün bazı isXXX metotları

fun isXXXofChar() {
    print("Input a character:")
    val ch = readln()[0]
    println(if (ch.isDigit()) "Digit" else "Not digit")
    println(if (ch.isWhitespace()) "Space" else "Not space")
    println(if (ch.isLetter()) "Alphabetic" else "Not Alphabetic")
}

/*
    Char türünün uppercase ve lowercase metotları String'e geri döner.
    Char dondüren versiyonları için upperCaseChar ve lowerCaseChar metotları kullanılmalıdır.
    uppercaseChar ve lowercaseChar metotları Kotlin 1.5 ile eklenmiştir
*/
fun upperAndLowerCaseInChar() {
    print("Input a character:")
    val ch = readln()[0]
    println(ch.uppercase()) // : String
    println(ch.lowercase()) // : String
    println(ch.uppercaseChar()) // : Char
    println(ch.lowercaseChar()) // : Char
}


/// String sınıfının substring metotları

fun substring() {
    val s = "ankara"
    println(s.substring(2))
    println(s.substring(2, 5)) //[2, 5)
    println(s.substring(2..4)) // [2, 4]
    println(s.substring(2..<5)) // [2, 5)
    println(s.substring(2 until 5)) // [2, 5)
}


fun substringAfterBefore() {
    val s = "ankara-istanbul-izmir"
    println(s.substringAfter('-'))
    println(s.substringBefore('-'))

    val ss = "ankara-istanbul-;izmir"
    println(ss.substringAfter("-;"))
    println(ss.substringBefore("-;"))
}

fun substringWithMissingDelimiter() {
    print("Input text:")
    val s = readln()

    println(s.substringAfter('-'))
    println(s.substringAfter('-', "Zonguldak"))
    println(s.substringBefore('-'))
    println(s.substringBefore('-', "Izmir"))
}


fun substringBeforeAfterLast() {
    print("Input text:")
    val s = readln()

    println(s.substringAfterLast('-'))
    println(s.substringBeforeLast('-'))
}

fun findFileNameWithsubstringAfterLast() {
    print("Dosya yol bilgisini giriniz:")
    val path = readln()
    val fileName = path.substringAfterLast('/') // substring(lastIndexOf('/') + 1)
    println(fileName)
}

fun checkEmailInput() {
    print("Input email:")
    val email = readln()
    val info = email.substringBefore('@', "Invalid email name")
    val domain = email.substringAfter('@', "Invalid email domain")
    val extension = email.substringAfterLast('.', "Invalid extension")

    println("Info: ${info}")
    println("Domain: ${domain}")
    println("Extension: .${extension}")
}
