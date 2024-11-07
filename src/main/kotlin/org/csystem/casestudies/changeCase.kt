package org.csystem.casestudies


/*---------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı bir yazının büyük harfleri küçük, küçük harleri büyük harf yapılmış
    ve geri kalan karakteler aynı olacak şekilde yeni bir yazıya geri dönen changeCase isimli fonksiyonu yazınız
    ve aşağıdaki kod ile test ediniz.
---------------------------------------------------------------------------------------------------------------------*/

fun main() = runChangeCaseTest()

fun runChangeCaseTest() {
    while (true) {
        print("Input text:")
        val s = readln()

        if ("quit" == s)
            break

        println(changeCase(s))
    }
}


fun changeCase(s: String): String {
    val sb = StringBuilder()

    for (c in s)
        if(c.isUpperCase())
            sb.append(c.lowercaseChar())
        else
            sb.append(c.uppercaseChar())

    return sb.toString()
}