package com.kok1337.graphqldemo.repository

import com.kok1337.graphqldemo.entity.Film
import org.springframework.data.jpa.repository.JpaRepository

interface FilmRepo : JpaRepository<Film, Long> {
    fun findByName(name: String): List<Film>
}