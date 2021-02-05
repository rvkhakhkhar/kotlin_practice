package com.ravi.chapter4.types

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    fun setup() {
        myService = MyService()
    }

    fun testAction() {
        myService.performAction()
    }
}