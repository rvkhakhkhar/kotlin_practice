package com.ravi

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader): Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException){
        null
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val readNumber = readNumber(BufferedReader(StringReader("239")))
    println(readNumber)
    println(readNumber?.plus(10))
    val readNumber1 = readNumber(BufferedReader(StringReader("23sfds9")))
    println(readNumber1)
    println(readNumber1?.plus(10))

}