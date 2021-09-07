package com.project.application.entrypoint.Car.repository.mappers

import com.project.application.entrypoint.credentiedPlaces.repository.entity.CredentiedPlaceEntity
import com.project.domain.credentiedPlace.entity.CredentiedPlace
import org.mapstruct.Mapper

@Mapper
interface CredentiedPlaceMappers {
    fun toEntity(credentiedPlace: CredentiedPlace): CredentiedPlaceEntity
    fun toDomain(credentiedPlaceEntity: CredentiedPlaceEntity): CredentiedPlace
}