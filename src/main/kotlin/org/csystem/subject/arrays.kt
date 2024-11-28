package org.csystem.subject

fun main() = initializationOfArray()

fun initializationOfArray() {
    val ia = intArrayOf(1,2,3,4)
    val da = doubleArrayOf(3.4, 5.7, 6.8)
    val ba = booleanArrayOf(false, true, false, true)
    val ca = charArrayOf('a', 'b', 'c')

    val cities = arrayOf("ankara", "istanbul", "izmir")

    for (city in cities)
        print("$city ")


    println("-------")

    val size = cities.size // Dizilerin eleman sayısına size property elemanı ile erişilebilir
    var i = 0
    while (i < size) {
        println(cities[i])
        ++i
    }

    println("-------")

    for (i in 0 until size)
        println(cities[i])

    println("-------")

    for (v in ia)
        print("$v ")

    val n = cities.count() // Dizilerin eleman sayısı count isimli extension fonksiyon ile de elde edilebilir
    for (i in 0 until n)
        println(cities[i])


    val a = arrayOf(10, 20, 30)
    for (i in a.indices) // Dizilerin indices property elemanı [0, size) aralığında bir IntRange referansına döner
        a[i] *= a[i]

    for (value in a)
        println("$value ")

}
