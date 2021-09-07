package com.project.domain.car.entity

import java.time.Year

data class Car (
    val id: Long,
    val name: String,
    val releaseYear: Year,
    val licensePlate: String,
    val brand: String
)