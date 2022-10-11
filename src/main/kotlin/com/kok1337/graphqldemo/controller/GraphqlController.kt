package com.kok1337.graphqldemo.controller

import com.kok1337.graphqldemo.entity.Country
import com.kok1337.graphqldemo.entity.Person
import com.kok1337.graphqldemo.repository.CountryRepo
import com.kok1337.graphqldemo.repository.PersonRepo
import org.springframework.data.repository.findByIdOrNull
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import java.util.Optional

@Controller
class GraphqlController(
    private val countryRepo: CountryRepo,
    private val personRepo: PersonRepo,
) {
    @QueryMapping
    private fun countries(): Iterable<Country> {
        return countryRepo.findAll()
    }

    @QueryMapping
    private fun country(@Argument code: String): Optional<Country> {
        return countryRepo.findById(code)
    }

    @QueryMapping
    private fun person(@Argument id: Long): Optional<Person> {
        return personRepo.findById(id)
    }
}