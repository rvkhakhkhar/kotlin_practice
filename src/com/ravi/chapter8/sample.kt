package com.ravi.chapter8

import java.lang.StringBuilder


fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char)-> Boolean) : String {
    val sb = StringBuilder()
    for(index in 0 until length) {
        val element = get(index)
        if(predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    transform: (T) -> String,
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    twoAndThree { a, b -> a * b }
    twoAndThree { a, b -> a + b }

    println("abcd2232".filter { it in 'a'..'z' })
    val letters = listOf("alpha", "beta")

    println(letters.joinToString { it.toUpperCase() })
}