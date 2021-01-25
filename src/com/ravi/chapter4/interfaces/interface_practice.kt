package com.ravi.chapter4.interfaces

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable !!")
}

interface Focusable {
    fun showOff() = println("I'm focusable !!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    println(Button().click())
    println(Button().showOff())
}

