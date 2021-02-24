package com.ravi.chapter8

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)


fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.STANDARD) {
        return { order ->
            6 + 2.1 * order.itemCount
        }
    }
    return { order ->
        1.2 * order.itemCount
    }
}

fun main() {
    val expeditedCalculator = getShippingCostCalculator(Delivery.EXPEDITED)
    val standardCalculator = getShippingCostCalculator(Delivery.STANDARD)
    val expeditedDeliveryCost = expeditedCalculator(Order(50))
    val standardDeliveryCost = standardCalculator(Order(50))
    println(expeditedDeliveryCost)
    println(standardDeliveryCost)
}
