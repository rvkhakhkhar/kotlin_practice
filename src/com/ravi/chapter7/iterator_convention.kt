package com.ravi.chapter7

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start
        override fun hasNext(): Boolean = current <= endInclusive

        override fun next(): LocalDate = current.apply {
            current = current.plusDays(1)
        }
    }

fun main(args: Array<String>) {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff){
        println(dayOff)
    }
}