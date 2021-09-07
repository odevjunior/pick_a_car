package com.project.application.entrypoint.credentiedPlaces.repository.entity

import javax.persistence.*

@Entity
@Table(name= "credentied_place")
data class CredentiedPlaceEntity(
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val location: String,
    val cep: String
)
