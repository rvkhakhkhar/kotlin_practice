package com.ravi

import java.lang.StringBuilder

fun String.lastChar(): Char = get(length - 1)

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) = setCharAt(length - 1, value)

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        suffix: String = ""
) = joinToString(separator, prefix, suffix)

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        suffix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(suffix)
    return result.toString()
}

open class View {
    open fun click() = println("click in view")
}

class Button : View() {
    override fun click() = println("click in Button")
}

fun View.showOff() = println("show off in view")
fun Button.showOff() = println("show off in Button")


fun main(args: Array<String>) {
    val randomStringBuilder = StringBuilder("hello stringbuilder")
    val randomString: String = "hello"
    val listOf = listOf("ABC", "DEF", "GHI")
    val listOfNumbers = listOf(1, 2, 3)
    println(randomString.lastChar())
    println(randomString.lastChar)
    println(randomStringBuilder.lastChar)
    randomStringBuilder.lastChar = 'z'
    println(randomStringBuilder.toString())
    println(listOf.join(separator = "# "))
    println(listOfNumbers.joinToString(separator = "# "))
//    println(listOfNumbers.join(separator = "# ")) won't work as it's receiver type is different
    println("randomString = ${randomString.lastChar()}")

    val view: View = Button()
    view.click()
    view.showOff()
}