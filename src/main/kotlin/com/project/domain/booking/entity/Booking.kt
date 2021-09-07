package com.project.domain.booking.entity

import com.project.domain.car.entity.Car
import com.project.domain.credentiedPlace.entity.CredentiedPlace
import com.project.domain.user.entity.User

data class Booking (
    val id: Long,
    val user: User,
    val car: Car,
    val pickUpPlace: CredentiedPlace,
    val deliveryPlace: Long?,
)