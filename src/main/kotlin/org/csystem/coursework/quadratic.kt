package org.csystem.coursework

import kotlin.math.sqrt

/*---------------------------------------------------------------------------------------------------------------------
Sınıf Çalışması: Klavyeden katsayıları girilen ikinci dereceden bir denklemin köklerini bulan programı yazınız.
Açıklama: Programda yeni nesil sqrt global fonksiyonunu kullanınız.
---------------------------------------------------------------------------------------------------------------------*/
fun main() = runQuadraticEquationRootsApp()

fun runQuadraticEquationRootsApp() {
    print("Input a:")
    val a = readln().toDouble()
    print("Input b:")
    val b = readln().toDouble()
    print("Input c:")
    val c = readln().toDouble()
//    findQuadraticEquationRoots(a, b, c)
//    println(findQuadraticEquationRoots2(a, b, c))
    println(findQuadraticEquationRoots3(a, b, c))
}

fun findQuadraticEquationRoots(a: Double, b: Double, c: Double) {
    fun calculateDelta() = b * b - 4 * a * c
    fun findByDeltaPositive(delta: Double) {
        val sqrtDelta = sqrt(delta)
        val x1 = (-b + sqrtDelta) / (2 * a)
        val x2 = (-b - sqrtDelta) / (2 * a)
        println("x1 = $x1, x2 = $x2")

    }
    fun findByDeltaZero() = println("x1 = x2 = ${-b / (2 * a)}")
    val delta = calculateDelta()

    if(delta > 0)
        findByDeltaPositive(delta)
    else if(delta == 0.0)
        findByDeltaZero()
     else
        println("No real root!...")
}

fun findQuadraticEquationRoots2(a: Double, b: Double, c: Double): String {
    fun calculateDelta() = b * b - 4 * a * c
    val delta = calculateDelta()

    fun calculateRoots(): String {
        val sqrtDelta = sqrt(delta)
        return "x1 = ${(-b + sqrtDelta) / (2 * a)}, x2 = ${(-b - sqrtDelta) / (2 * a)}"
    }

    return if(delta > 0)
        calculateRoots()
    else if(delta == 0.0)
        "x1 = x2 = ${-b / (2 * a)}"
    else
        "No real root!..."
}

fun findQuadraticEquationRoots3(a: Double, b: Double, c: Double): String {
    fun calculateDelta() = b * b - 4 * a * c
    val delta = calculateDelta()

    fun calculateRoots(): String {
        val sqrtDelta = sqrt(delta)
        return "x1 = ${(-b + sqrtDelta) / (2 * a)}, x2 = ${(-b - sqrtDelta) / (2 * a)}"
    }

    return if(delta >= 0)
        calculateRoots()
    else
        "No real root!..."
}
