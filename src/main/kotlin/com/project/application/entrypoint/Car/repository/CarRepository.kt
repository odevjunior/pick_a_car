package com.project.application.entrypoint.Car.repository

import com.project.application.entrypoint.Car.repository.entity.CarEntity
import io.micronaut.data.jpa.repository.JpaRepository

interface CarRepository: JpaRepository<CarEntity, Long> {
}