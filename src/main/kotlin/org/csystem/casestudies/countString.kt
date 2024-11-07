package org.csystem.casestudies

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı iki yazıdan birincisi içerisinde ikincisinden kaç tane olduğunu döndüren
    countString isimli fonksiyonu ignoreCase parametresi de içerecek şekilde yazınız.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runCountStringTest()

fun runCountStringTest() {
    while (true) {
        print("Input first text:")
        val s1 = readln()

        if("quit" == s1)
            break

        print("Input second text:")
        val s2 = readln()

        println("Count: ${countString(s1, s2)}")
        println("Count (Ignore case): ${countString(s1, s2, true)}")
    }
}

fun countString(s1: String, s2: String, ignoreCase: Boolean = false): Int {
    var count = 0
    var index = -1

    while (true) {
        index = s1.indexOf(s2, index + 1, ignoreCase)

        if(index == -1)
            break
        ++count
    }
    return count
}
