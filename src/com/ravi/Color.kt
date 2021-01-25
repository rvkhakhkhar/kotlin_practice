package com.ravi

import com.ravi.Color.*
import java.lang.Exception

enum class Color(
    val r: Int, val g: Int, val b: Int
){
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) = when(color) {
    RED -> "Richard"
    ORANGE -> "Of"
    YELLOW -> "York"
    GREEN -> "Gave"
    BLUE -> "Battle"
    INDIGO -> "In"
    VIOLET -> "Vain"
}

fun getWarmth(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty Color")
    }

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == YELLOW && c2 == RED) ||
                (c1 == RED && c2 == YELLOW)  -> ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
                (c1 == BLUE && c2 == YELLOW)  -> GREEN

        (c1 == VIOLET && c2 == BLUE) ||
                (c1 == BLUE && c2 == VIOLET)  -> INDIGO
        else -> throw Exception("Dirty Color")
    }


fun main(args: Array<String>) {
    println(INDIGO.rgb())
    println(getMnemonic(VIOLET))
    println(getWarmth(Color.GREEN))
    println(mix(RED, YELLOW))
    println(mixOptimized(RED, YELLOW))
    println(mix(RED, BLUE))
}