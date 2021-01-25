package com.ravi

fun iterate(vararg values: String) {
    for (v in values) {
        println("$v ")
    }
}

infix fun Int.plus(other: Int) = this + other

infix fun Any.to(other: Any) = Pair(this, other)

class User(private val name: String) {
    infix fun append(other: String) = this.name + " " + other
}

fun main(args: Array<String>) {
    val list = listOf("args:", *args)
    println(list)
    iterate("1", "3", "z", "j", "h")

    val user = User("ravi")

    val sum = 1 plus 5
    val (number, name) = 1 to "One"
    println("$number - $name")
    println("Sum $sum")
    println(user append "khakhkhar")
}