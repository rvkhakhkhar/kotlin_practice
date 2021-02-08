package com.ravi.chapter7

import java.math.BigDecimal

class Point(var x: Int, var y: Int) {
    operator fun plus(other: Point): Point {
        return Point(this.x + other.x, this.y + other.y)
    }

    operator fun unaryMinus(): Point {
        return Point(-x, -y)
    }

    override fun equals(other: Any?): Boolean {
        if(other === this) return true
        if(other !is Point) return false
        return other.x == x && other.y == y
    }
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Point.minusAssign(scale: Double): Unit {
    x -= scale.toInt()
    y -= scale.toInt()
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    val point1 = Point(15, 45)
    val point2 = Point(10, 2)
    var point3 = point1 + point2
    println(point3)
    point3 -= 2.0
    println(point3)
    println(point3 * 3.0)
    println('a' * 3)

    val arrayListOf = arrayListOf(1, 2)
    arrayListOf += 3
    val newList = arrayListOf + listOf(4, 5)
    println(newList)
    println(-point1)

    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}