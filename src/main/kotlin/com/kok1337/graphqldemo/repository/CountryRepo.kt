package com.kok1337.graphqldemo.repository

import com.kok1337.graphqldemo.entity.Country
import org.springframework.data.jpa.repository.JpaRepository

interface CountryRepo : JpaRepository<Country, String>