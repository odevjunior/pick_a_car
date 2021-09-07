package com.project.application.entrypoint.credentiedPlaces.repository

import com.project.application.entrypoint.credentiedPlaces.repository.entity.CredentiedPlaceEntity
import io.micronaut.data.jpa.repository.JpaRepository

interface CredentiedPlaceRepository: JpaRepository<CredentiedPlaceEntity, Long> {
}