package com.ravi

class Table(val height: Int, val length: Int, var width: Int, var isRounded: Boolean) {

    val area: Int
        get() = height * width * length
    val circumference: Int
        get() = height + length + width

    fun getArea1(coefficient: Int) : Int = area * coefficient
}