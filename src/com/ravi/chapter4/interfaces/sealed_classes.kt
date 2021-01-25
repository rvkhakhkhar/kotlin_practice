package com.ravi.chapter4.interfaces

sealed class Expr {
    abstract val m: Int
    abstract fun hello()
}

class Num(val value: Int) : Expr() {
    override val m: Int = 10
    override fun hello() {
    }
}

class Sum(val left: Expr, val right: Expr) : Expr() {
    override val m: Int = 165
    override fun hello() {
    }
}

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
}