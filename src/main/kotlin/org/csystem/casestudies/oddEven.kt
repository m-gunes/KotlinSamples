package org.csystem.casestudies


/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Klavyeden alınan a ve b Int türden değerleri için [a, b] aralığında tek ve çift sayıları ayrı ayrı
    toplayan programı yazınız. Örnekte isEven fonksiyonun "capture" yaptığına dikkat ediniz.
---------------------------------------------------------------------------------------------------------------------*/


fun main() = runOddEvenApp()


fun runOddEvenApp() {
    print("a?")
    val a = readln().toInt()

    print("b?")
    val b = readln().toInt()

    findOddEvenTotals(a, b)
}

fun findOddEvenTotals(a: Int, b: Int) {
    var oddTotal = 0
    var evenTotal = 0
    for(n in a..b) {
        fun isEven() = n % 2 == 0
        if(isEven())
           evenTotal += n
        else
            oddTotal += n
    }
    println("Odd = $oddTotal, Even = $evenTotal")
}
