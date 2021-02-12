package com.ravi.chapter7

data class NameComponents(val name: String, val extension: String)


fun spiltNames(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun main(args: Array<String>) {
    val (name, ext) = spiltNames("example.kt")
    println(name)
    println(ext)
}