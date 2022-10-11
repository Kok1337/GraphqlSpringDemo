package com.kok1337.graphqldemo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "race")
class Race(
    @Id
    var id: Long? = null,

    @Column
    var name: String? = null,
)