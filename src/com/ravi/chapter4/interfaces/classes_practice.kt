package com.ravi.chapter4.interfaces

open class RichButton : Clickable {
    override fun click() = println("click in rich button")
    open fun animate() = println("I'm dancing in rich button")
    fun disable() {}
}

open class ExtraRichButton : RichButton() {

    override fun animate() {
        super.animate()
    }

    final override fun click() {
        println("click in Extra Rich Button")
    }

    /* Not possible to override non open methods
    override fun disable() {
        super.disable()
    }
    */
}

abstract class Animated {
    abstract fun animate()
    open fun stopAnimating() = println("Animated - stopAnimating")
    fun animateTwice() = println("Animated - animateTwice")
}

class AnimatedButton : Animated() {
    override fun animate() {
        println("AnimatedButton - animate")
    }

    override fun stopAnimating() {
        super.stopAnimating()
        println("AnimatedButton - stopAnimating")
    }
    /* Can't override non-open function
    override fun animateTwice() {

    }*/

}


class FancyButton : ExtraRichButton() {
    /* Not possible to override final overridden method
    override fun click() {
        super.click()
    }*/
}

fun main(args: Array<String>) {
    val extraRichButton = ExtraRichButton()
    extraRichButton.showOff()
    extraRichButton.click()
    extraRichButton.animate()

    FancyButton().click()

    val animatedButton = AnimatedButton()
    animatedButton.animate()
    animatedButton.stopAnimating()
    animatedButton.animateTwice()
}