package com.ravi.chapter7

data class Person(val firstName: String, val lastName: String): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::firstName, Person::lastName)
    }

}

fun main(args: Array<String>) {
    val point1 = Point(10, 20)
    val point2 = Point(10, 20)
    println(point1 == point2)
    println(point1 != point2)
    println(null == point1)

    println("Person comparison")
    val person1 = Person("Alice", "Smith")
    val person2 = Person("Bob", "Johnson")
    println(person1 < person2)
}