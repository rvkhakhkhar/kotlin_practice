package com.ravi.chapter4.types

fun String?.length1(): Int = this?.length ?: 0

fun verifyUserInput(input: String?): Unit {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun <T> printCode(t: T) {
    println(t?.hashCode())
}

fun main(args: Array<String>) {
    println("hello".length1())
    println("  ".length1())
    println(verifyUserInput(null))
    println(printCode(null))
}