package com.ravi.chapter4.interfaces

class Person(val name: String) {
    class Address {
        fun foo() = 2
    }
}

class Outer {
    private val bar :Int = 1
    inner class Inner {
        fun foo(): Outer = this@Outer
    }
}

fun main(args: Array<String>) {
    val foo = Person.Address().foo()
    println(foo)

    val foo1 = Outer().Inner().foo()
    println(foo1)
}