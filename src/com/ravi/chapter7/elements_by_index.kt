package com.ravi.chapter7


operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> this.x
        1 -> this.y
        else -> throw IndexOutOfBoundsException("invalid co-ordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("invalid co-ordinate $index")
    }
}

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(p[0])
    println(p[1])

    println("Mutable Point")
    val p1 = MutablePoint(10, 20)
    p1[1] = 56
    println(p1)
}