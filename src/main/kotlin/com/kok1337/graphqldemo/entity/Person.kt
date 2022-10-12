package com.kok1337.graphqldemo.entity

import javax.persistence.*

@Entity
@Table(name = "person")
class Person(
    @Id
    @Column
    var id: Long? = null,

    @Column(name = "first_name")
    var firstName: String? = null,

    @Column(name = "last_name")
    var lastName: String? = null,

    @ManyToOne
    @JoinColumn(name="country_code", referencedColumnName = "code")
    var country: Country? = null,

    @ManyToOne
    @JoinColumn(name="gender_id", referencedColumnName = "id")
    var gender: Gender? = null,

    @ManyToOne
    @JoinColumn(name="race_id", referencedColumnName = "id")
    var race: Race? = null,

    @ManyToMany(mappedBy = "actors")
    var films: Set<Film> = emptySet()
)