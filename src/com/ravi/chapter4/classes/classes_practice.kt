package com.ravi.chapter4.classes

class User(_nickname: String) {
    val nickname = _nickname
}

open class User1(val nickname: String, val isSubscribed: Boolean = true)

class TwitterUser(handle: String, nickname: String) : User1(nickname) {

}

class View {
    val name: String
    constructor(name: User) {
        this.name = name.nickname
    }
    constructor(ctx: User1) {
        this.name = ctx.nickname
    }
}

fun main(args: Array<String>) {
    val user = User("me")
    user.nickname

    val user1 = User1("Alice")
    val user2 = User1("bob", false)
    val twitterUser = TwitterUser("handle one", "nickname")


}