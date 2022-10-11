package com.kok1337.graphqldemo.repository

import com.kok1337.graphqldemo.entity.Gender
import org.springframework.data.jpa.repository.JpaRepository

interface GenderRepo : JpaRepository<Gender, Long>