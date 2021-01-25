package com.ravi.chapter4.classes

class User(_nickname: String) {
    val nickname = _nickname
}

open class User1(nickname: String, isSubscribed: Boolean = true)

class TwitterUser(handle: String, nickname: String) : User1(nickname) {

}

fun main(args: Array<String>) {
    val user = User("me")
    user.nickname

    val user1 = User1("Alice")
    val user2 = User1("bob", false)

}