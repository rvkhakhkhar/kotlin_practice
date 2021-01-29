package com.ravi.chapter4.classes

class A private constructor(val name: String) {

    companion object {
        fun bar(name: String): A {
            println("Companion Object")
            return A(name)
        }
    }
}

interface JsonFactory<T> {
    fun fromJson(jsonText: String): T
}

class Person (val name: String) {
    companion object : JsonFactory<Person> {
        fun default(jsonText: String): Person = Person("fixed name")
        override fun fromJson(jsonText: String): Person = Person("person from json factory")
    }

    override fun toString(): String {
        return "Person(name=$name)"
    }
}

fun Person.Companion.fromXml(xmlText: String) : Person = Person("person from xml")

fun <T> loadFromJson(factory: JsonFactory<T>, jsonText: String): T = factory.fromJson(jsonText = jsonText)

fun main() {
    val bar = A.bar("ravi")
    println(bar.name)
    val fromDefault = Person.default("{name:'Dmitry'}")
    println(fromDefault.name)
    val fromJson = Person.fromJson("{name:'Dmitry'}")
    println(fromJson.name)
    loadFromJson(Person, "{name:'Dmitry'}")
    val fromXml = Person.fromXml("<name>ravi</name>")
    println(fromXml.name)

    val personList = arrayListOf(fromDefault, fromJson, fromXml)
    val sortedWith = personList.sortedWith(object : Comparator<Person> {
        override fun compare(o1: Person?, o2: Person?): Int = o2!!.name.compareTo(o1!!.name)
    })
    println(personList)
    println(sortedWith)
}