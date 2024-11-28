package org.csystem.kotlin.util.array

import kotlin.random.Random

fun randomArray(count: Int, origin: Int, bound: Int, random: Random = Random): IntArray {
    val randomArr = IntArray(count)

    for (i in 0..<count)
        randomArr[i] = random.nextInt(origin, bound)

    return randomArr
}
