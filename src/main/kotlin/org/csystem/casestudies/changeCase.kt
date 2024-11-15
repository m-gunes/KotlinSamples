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


fun changeCase_v1(s: String): String {
    val sb = StringBuilder()

    for (c in s)
        if(c.isUpperCase())
            sb.append(c.lowercaseChar())
        else
            sb.append(c.uppercaseChar())

    return sb.toString()
}

fun changeCase_v2(s: String): String {
    val sb = StringBuilder(s)

    for (i in s.indices)
        sb[i] = if (sb[i].isUpperCase())
            sb[i].lowercaseChar()
        else
            sb[i].uppercaseChar()

    return sb.toString()
}

fun changeCase(s: String): String {
    val sb = StringBuilder(s)

    for (i in s.indices)
        sb[i] = when {
            s[i].isUpperCase() -> s[i].lowercaseChar()
            else -> s[i].uppercaseChar()
        }

    return sb.toString()
}
