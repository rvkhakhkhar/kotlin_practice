package com.ravi

data class Person(val name: String, val age: Int = 0)


fun main(args: Array<String>) {
    val persons = listOf(
        Person("ravi", 33),
        Person("riddhi", 35)
    )

    val oldest = persons.maxBy { it.age }
    println(oldest)
}