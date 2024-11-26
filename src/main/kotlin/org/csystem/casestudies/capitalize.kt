package org.csystem.casestudies

/**
 * Sınıf Çalışması: Parametresi ile aldığı bir yazının baş harfini büyük geri kalan harflerini küçük yapan capitalize isimli fonksiyonu yazınız ve test ediniz.
 *
 * Örnek: profesyonel Bir Android Programcısı olmak için çok çalışmak gerekir -> Profesyonel bir android programcısı olmak için çok çalışmak gerekir.
 */
fun main() = runCapitalize()

fun runCapitalize() {
    print("Input text:")
    val s = readln();
    println(capitalize(s))
}

fun capitalize(s: String) = if (s != "") s[0].uppercase() + s.substring(1).lowercase() else ""
