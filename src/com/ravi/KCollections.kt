@file:JvmName("StringFunctions")
package com.ravi
import java.lang.StringBuilder

var SEPARATOR = "$ "

@JvmOverloads
fun <T> joinToString(
        collection: Collection<T>,
        separator: String = SEPARATOR,
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(list.last())
    println(list.first())
    println(set.max())
    println(set.min())
    println(joinToString(collection = list))
    println(joinToString(collection = list, separator = "; ", prefix = "->"))
    println(joinToString(collection = list, separator = "; ", prefix = "(", postfix = ")"))
}