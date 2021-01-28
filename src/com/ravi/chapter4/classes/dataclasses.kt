package com.ravi.chapter4.classes

data class DataClient(val name: String, val postCode: Int)


fun main() {
    val dataClient = DataClient("name1", 343243)
    val dataClient1 = DataClient("name1", 343243)

    val dataClient2 = dataClient.copy(postCode = 44444)
    println(dataClient == dataClient1)
    println(dataClient2)
}