package com.ravi.chapter4.lamdas

import java.lang.StringBuilder

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabetWith() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun alphabetApply() = StringBuilder().apply {
    for(letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun alphabetBuildString() = buildString {
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nI know the alphabet!")
}

fun main() {
    println(alphabet())
    println(alphabetWith())
    println(alphabetApply())
    println(alphabetBuildString())
    Person("a", 32).apply {
        address = "afafasdfa"
    }
}