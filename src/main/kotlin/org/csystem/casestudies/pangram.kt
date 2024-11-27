package org.csystem.casestudies

import org.csystem.kotlin.util.string.isPangramEN
import org.csystem.kotlin.util.string.isPangramTR

/**
 * Sınıf Çalışması: Parametresi ile aldığı bir yazının pangram olup olmadığını test eden isPangramTR ve isPangramEN fonksiyonlarını stringUtil.kt dosyası içerisinde yazınız ve aşağıdaki kod ile test ediniz.
 *
 * Açıklama: Fonksiyonlar özel isim ve cümle anlamı kontrolü yapmayacaktır.
 *
 * Türkçe pangram: Pijamalı hasta yağız şoföre çabucak güvendi
 *
 * İngilizce pangram: The quick brown fox jumps over the lazy dog
 */

fun main() = runPangramTest()

fun runPangramTest() {
    runPangramTRTest()
    runPangramENTest()
}

fun runPangramTRTest() {
   while (true) {
       print("Input text:")
       val s = readln()

       if ("exit" == s)
           break

       println(if (isPangramTR(s)) "Pangram" else "Not a pangram")
   }
}

fun runPangramENTest() {
    while (true) {
        print("Input text:")
        val s = readln()

        if ("exit" == s)
            break

        println(if (isPangramEN(s)) "Pangram" else "Not a pangram")
    }
}
