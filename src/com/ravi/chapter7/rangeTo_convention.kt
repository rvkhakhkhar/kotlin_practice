package com.ravi.chapter7

import java.time.LocalDate


fun main(args: Array<String>) {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)

    val closedRange = Person("ravi", "khakhkhar")..(Person("x", "z"))
    println(closedRange)
    println(now.plusWeeks(1) in vacation)
}