package org.csystem.casestudies

fun main() = runDateApp()

fun isLeapYear(year: Int) = year % 4 == 0 && year % 100 != 0 || year % 400 == 0

fun getDays(month: Int, year: Int): Int = when(month){
    4, 6, 9, 11 -> 30
    2 -> if(isLeapYear(year)) 29 else 28
    else -> 31
}

fun isValidDate(day: Int, month: Int, year: Int) = day in 1..31 && month in 1..12 && year >= 1900 && day <= getDays(month, year)

fun getDayOfYear(day: Int, month: Int, year: Int): Int {
    var dayOfYear = day

    for (m in month - 1 downTo 1)
        dayOfYear += getDays(m, year)

    return dayOfYear
}

fun getTotalDays(day: Int, month: Int, year: Int): Int {
    var totalDays = getDayOfYear(day, month, year)

    for (y in 1900..<year)
        totalDays += if (isLeapYear(y)) 366 else 365

    return totalDays
}

fun getDayOfWeek(day: Int, month: Int, year: Int) = if(isValidDate(day, month, year)) getTotalDays(day, month, year) % 7 else -1

fun getDayOfWeekStr(dayOfWeekValue: Int) = when(dayOfWeekValue) {
    0 -> "Sunday"
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    else -> ""
}

fun printDate(day: Int, month: Int, year: Int) {
    var dayOfWeekValue = getDayOfWeek(day, month, year)
    if(dayOfWeekValue != -1)
        println("%02d/%02d/%04d %s".format(day, month, year, getDayOfWeekStr(dayOfWeekValue)))
    else
        println("Invalid date...")
}

fun runDateApp() {
    while(true) {
        print("day?")
        var day = readln().toInt()
        if(day == 0)
            break

        print("month?")
        var month = readln().toInt()

        print("year?")
        var year = readln().toInt()

        printDate(day, month, year)
    }
}
