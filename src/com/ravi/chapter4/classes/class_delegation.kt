package com.ravi.chapter4.classes

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        println(x)
    }
}

class DelegatedBase(b: Base = BaseImpl(5)) : Base by b

class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> by innerSet {
    var objectsAdded = 0
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val b = BaseImpl(10)
    val delegatedBase = DelegatedBase(b)
    delegatedBase.print()

    val countingSet = CountingSet<Int>()
    countingSet.addAll(listOf(1, 2, 3))
    println(countingSet.objectsAdded)
}