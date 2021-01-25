package com.ravi.chapter4.interfaces


internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hell ya")
    protected fun whisper() = println("Let's talk")
}
class Sample {
    val name:String
    constructor(sampleName: String){
        name = sampleName
    }
}

class Login private constructor(val username: String)

open class Kclass {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        val e: Int = 5
    }
}

class SubClass : Kclass() {

    override val b = 5

    fun getC(): Int {
        return this.c
    }

    fun getNestedValue(): Int {
        return Nested().e
    }

}

fun main(values: Array<String>) {
    val showOff = TalkativeButton().showOff()
    println(showOff)
    val nestedValue = SubClass().getNestedValue()
    println(nestedValue)
    val name = Sample("ravi").name
    println(name)


}