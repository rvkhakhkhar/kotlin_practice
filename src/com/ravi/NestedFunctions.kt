package com.ravi

fun outerFunction(list: List<String>) {
    fun innerFunction() {
        if (list.isEmpty()) {
            throw IllegalArgumentException("no empty list allowed ")
        }
    }
    innerFunction()
}

fun main(args: Array<String>) {
    outerFunction(emptyList())
}