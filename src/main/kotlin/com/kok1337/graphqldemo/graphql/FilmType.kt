package com.kok1337.graphqldemo.graphql

import com.kok1337.graphqldemo.entity.Film

data class FilmType(private val film: Film) {
    val id: Long get() = film.id!!
    val name: String get() = film.name!!
    val description: String get() = film.description!!

    val actors: Set<PersonType> get() = film.actors.map { PersonType(it) }.toSet()
}