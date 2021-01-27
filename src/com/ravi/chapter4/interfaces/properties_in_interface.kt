package com.ravi.chapter4.interfaces

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User {
    var address: String = "unspecified"
        set(value: String) {
            println("""
               Address was changed for $nickname"
                $field --> $value
            """.trimIndent())
            field = value
        }

}

class SubscribingUser(val emailId: String) : User {
    override val nickname: String
        get() = emailId.substringBefore("@")
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = accountId.toString()
}


interface User1 {
    val email: String
    val name: String
        get() = email.substringAfter("@")
}

class LengthCounter {
    var counter : Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val privateUser = PrivateUser("raviyo")
    privateUser.address = "raviyo 1"
    privateUser.address = "raviyo 2"

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("dfdfdf")
    lengthCounter.addWord("dfdfdf")
    println(lengthCounter.counter)
}