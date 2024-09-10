package org.csystem.coursework

/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması:
        Parametresi ile aldığı Int türden bir sayının palindrom olup olmadığını test eden isPalindrome fonksiyonunu
        yazınız ve aşağıdaki kod ile test ediniz.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runIsPalindromeTest()

fun runIsPalindromeTest() {
    while (true) {
        print("Input a number: ")
        val value = readln().toInt()
        println("$value is ${if(isPalidrome(value)) "palindrome" else "not palidrome"}")

        if(value == 0)
            break
    }
}

fun isPalidrome(a: Int) = reverse(a) == a
