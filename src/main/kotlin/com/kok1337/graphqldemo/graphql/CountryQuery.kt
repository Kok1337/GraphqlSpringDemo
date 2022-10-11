package com.kok1337.graphqldemo.graphql

import com.kok1337.graphqldemo.entity.Country
import com.kok1337.graphqldemo.repository.CountryRepo
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
//
//@Component
//class CountryQuery(
//    private val countryRepo: CountryRepo,
//) : GraphQLQueryResolver {
//    fun getCountry(code: String?): Country? {
//        return countryRepo.findByIdOrNull(code)
//    }
//}