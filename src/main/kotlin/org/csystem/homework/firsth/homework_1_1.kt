package org.csystem.homework.firsth

import org.csystem.topics.max
import kotlin.math.min

fun main() {
    print("a?")
    var a = readln().toInt()
    print("b?")
    var b = readln().toInt()
    print("c?")
    var c = readln().toInt()

    val max =  max(a, max(b, c))
    val min = min(a, min(b, c))
    val mid = (a + b + c) - (min + max)

    if(min == mid) {
        print("$min = $mid ")
        if(mid == max)
            print("= $max")
        else
            print("< $max")
    }

    if(min < mid) {
        print("$min < $mid ")
        if(mid == max)
            print("= $max")
        else
            print("< $max")
    }
}