package com.kok1337.graphqldemo.graphql

import com.kok1337.graphqldemo.entity.Country

data class CountryType (private val country: Country) {
    val code: String get() = country.code!!
    val name: String get() = country.name!!
}