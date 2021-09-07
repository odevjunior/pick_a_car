package com.project.application.entrypoint.Car.repository.mappers

import com.project.application.entrypoint.Car.repository.entity.CarEntity
import com.project.domain.car.entity.Car
import org.mapstruct.Mapper

@Mapper
interface CarMappers {
    fun toEntity(car: Car): CarEntity
    fun toDomain(carEntity: CarEntity): Car
}