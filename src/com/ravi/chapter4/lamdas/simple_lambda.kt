package com.ravi.chapter4.lamdas


data class Person(val name: String, val age: Int)

fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun getAge(p: Person) = p.age

fun main() {
    val sum = { x: Int, y: Int ->
        println("Computing the sume of $x and $y")
        x + y
    }
    run { println("hello") }

    val persons = listOf(Person("Alice", 29), Person("Bob", 31))
    println(persons.maxBy(Person::age))
    println(persons.maxBy { p: Person -> p.age })
    println(persons.maxBy(::getAge))
    val joinToString = persons.joinToString(" ") { it.name }
    println(joinToString)
    println(sum(5, 7))

    printMessageWithPrefix(listOf("403 Forbidden", "404 Not found"), "Error")
    printProblemCounts(listOf("200OK", "418 I'm a teapot", "500 Internal Server Error"))
}
