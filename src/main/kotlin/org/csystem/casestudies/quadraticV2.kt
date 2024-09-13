package org.csystem.casestudies

import kotlin.math.sqrt

/*---------------------------------------------------------------------------------------------------------------------
Sınıf Çalışması: Klavyeden katsayıları girilen ikinci dereceden bir denklemin köklerini bulan programı yazınız.
Açıklama: Programda yeni nesil sqrt global fonksiyonunu kullanınız.

Not: V2'de if yerine when ifadesi kullanilmistir.
---------------------------------------------------------------------------------------------------------------------*/
fun main() = runQuadraticEquationRootsAppV2()

fun runQuadraticEquationRootsAppV2() {
    print("Input a:")
    val a = readln().toDouble()
    print("Input b:")
    val b = readln().toDouble()
    print("Input c:")
    val c = readln().toDouble()
    println(findQuadraticEquationRootsV2(a, b, c))
}

fun findQuadraticEquationRootsV2(a: Double, b: Double, c: Double): String {
    fun calculateDelta() = b * b - 4 * a * c
    val delta = calculateDelta()

    fun calculateRoots(): String {
        val sqrtDelta = sqrt(delta)
        return "x1 = ${(-b + sqrtDelta) / (2 * a)}, x2 = ${(-b - sqrtDelta) / (2 * a)}"
    }

    return when {
        delta >= 0 -> calculateRoots()
        else -> "No real root!..."
    }
}
