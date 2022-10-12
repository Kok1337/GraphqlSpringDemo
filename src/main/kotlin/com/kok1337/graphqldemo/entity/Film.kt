package com.kok1337.graphqldemo.entity

import javax.persistence.*

@Entity
@Table(name = "film")
class Film(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    var id: Long? = null,

    @Column
    var name: String? = null,

    @Column
    var description: String? = null,

    @ManyToMany()
    @JoinTable(
        name = "film_actor",
        joinColumns = [JoinColumn(name = "film_id")],
        inverseJoinColumns = [JoinColumn(name = "person_id")]
    )
    var actors: Set<Person> = emptySet(),
)