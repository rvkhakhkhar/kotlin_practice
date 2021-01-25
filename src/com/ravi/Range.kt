package com.ravi

import java.util.TreeMap



fun fizBuzz(i: Int) = when {
    i % 15 == 0 -> "FizBuzz"
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun iterateMap() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for((letter, binary) in binaryReps) {
        println("$letter - $binary")
    }
}

fun iterateListWithIndex() {
    val list = arrayListOf("10", "11", "1001")
    for((index, element) in list.withIndex()){
        println("$index - $element")
    }
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNoDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    val oneToTen = 1..100
    for (i in 1 until 100 step 3) {
        print(fizBuzz(i))
    }
    println()
    for(i in 100 downTo 1 step 2) {
        print(fizBuzz(i))
    }
    println()
    iterateMap()
    println()
    iterateListWithIndex()
    println(isLetter('q'))
    println(isNoDigit('x'))
}