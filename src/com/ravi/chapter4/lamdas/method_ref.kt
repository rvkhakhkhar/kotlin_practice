package com.ravi.chapter4.lamdas


fun salute() = println("Salute !!")

val action = { person: Person, message: String ->
    sendMail(person, message)
}

fun sendMail(person: Person, message: String) {
    println("sending mail to ${person.name} with message $message")
}

fun Person.isAdult() = age >= 21

val nextAction = ::sendMail
val createPerson = ::Person
val predicate = Person::isAdult

fun main() {
    run(::salute)
    val person = createPerson("ravi", 32)
    val person2 = createPerson("mohit", 20)
    val persons = listOf(person, person2)
    println(persons.filter(predicate))
    nextAction(person, "asfdfd")
}
