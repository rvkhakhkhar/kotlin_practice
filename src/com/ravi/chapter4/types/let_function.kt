package com.ravi.chapter4.types

fun sendEmail(email: String) {
    with(email) {
        println("sending email to $email")
    }
}

fun main() {
    val email: String? = "randm@random.com"
    if (email != null) {
        sendEmail(email)
    }
    email?.let { sendEmail(it) }
}