package com.kok1337.graphqldemo.graphql

import com.kok1337.graphqldemo.entity.Person

data class PersonType(private val person: Person) {
    val id: Long get() = person.id!!
    val firstName: String get() = person.firstName!!
    val lastName: String get() = person.lastName!!
    val country: String get() = person.country!!.name!!
    val gender: String get() = person.gender!!.name!!
    val race: String get() = person.race!!.name!!

    val films: Set<FilmType> get() = person.films.map { FilmType(it) }.toSet()
}