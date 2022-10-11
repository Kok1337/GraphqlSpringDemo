package com.kok1337.graphqldemo.repository

import com.kok1337.graphqldemo.entity.Race
import org.springframework.data.jpa.repository.JpaRepository

interface RaceRepo : JpaRepository<Race, Long>