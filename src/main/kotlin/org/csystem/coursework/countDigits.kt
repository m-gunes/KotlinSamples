package org.csystem.coursework


/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı Int türden bir sayının basamak sayısını döndüren countDigits isimli
    fonksiyonu döngü kullanarak yazınız ve aşağıdaki kod ile test ediniz.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runCountDigitsTest()

fun runCountDigitsTest() {
    while (true) {
        print("Input a number: ")
        val a = readln().toInt()
        println("$a is ${countDigits(a)} digits.")
        if(a == 0)
            break
    }
}

fun countDigits(a: Int):Int {
    var count = 0;
    var temp = a

    do {
        ++count
        temp /= 10
    } while (temp != 0)

    return count
}
