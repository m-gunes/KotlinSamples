package org.csystem.subject

import kotlin.random.Random

fun main() = randomInJavaAndKotlin()

fun randomInJavaAndKotlin() {
    // Kotlin ve Java'daki Random siniflarinin algoritmalari farklidir. Dolayisiyla ayni seed degeri ile farkli sonuclar elde edilir.
    print("Input a seed value: ")
    val seed = readln().toLong()
    val randomKotlin = Random(seed)
    val randomJava = java.util.Random(seed)

    for (i in 1..10)
        print("${randomKotlin.nextInt(99) + 1} ")

    println()

    for (i in 1..10)
        print("${randomJava.nextInt(99) + 1} ")
}

fun randomWithSeed() {
    while (true) {
        print("Input a seed value:")
        val seed = readln().toLong()
        val r = Random(seed) // ayni tohum degeri her zaman ayni dizilimi verir

        for (i in 1..10)
            print("${r.nextInt(0, 100)} ")

        println()

        if(seed == 0L)
            break
    }
}

fun randomWithoutSeed() {
    print("Input a number:")
    val count = readln().toInt()
    for(i in 0..<count)
        print("${Random.nextInt(0, 100)} ") // [0,100)

    println()

    for (i in 0..<count)
        print("${Random.nextBoolean()} ")

    println()

    for (i in 0..<count)
        print("${Random.nextDouble()} ") // [0,1)
}
