package com.kok1337.graphqldemo.controller

import com.kok1337.graphqldemo.entity.Film
import com.kok1337.graphqldemo.graphql.CountryType
import com.kok1337.graphqldemo.graphql.FilmInput
import com.kok1337.graphqldemo.graphql.FilmType
import com.kok1337.graphqldemo.graphql.PersonType
import com.kok1337.graphqldemo.repository.CountryRepo
import com.kok1337.graphqldemo.repository.FilmRepo
import com.kok1337.graphqldemo.repository.PersonRepo
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.*

@Controller
// http://localhost:8080/graphiql для тестирования
class GraphqlController(
    private val filmRepo: FilmRepo,
    private val personRepo: PersonRepo,
    private val countryRepo: CountryRepo,
) {
    @QueryMapping
    private fun countries(): Iterable<CountryType> {
        return countryRepo.findAll().map { CountryType(it) }
    }

    @QueryMapping
    private fun country(@Argument code: String): Optional<CountryType> {
        return countryRepo.findById(code).map { CountryType(it) }
    }

    @QueryMapping
    private fun person(@Argument id: Long): Optional<PersonType> {
        return personRepo.findById(id).map { PersonType(it) }
    }

    @QueryMapping
    private fun film(@Argument name: String): Iterable<FilmType> {
        return filmRepo.findByName(name).map { FilmType(it) }
    }

    @MutationMapping
    private fun createFilm(@Argument film: FilmInput): FilmType {
        val newFilm = Film(
            name = film.name,
            description = film.description,
        )
        return FilmType(filmRepo.save(newFilm))
//        println("${film.id}  ${film.name}")
    }
}