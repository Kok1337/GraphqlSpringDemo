package com.kok1337.graphqldemo.repository

import com.kok1337.graphqldemo.entity.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepo : JpaRepository<Person, Long>