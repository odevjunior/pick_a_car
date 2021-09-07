package com.project.application.entrypoint.booking.repository.entity

import com.project.application.entrypoint.Car.repository.entity.CarEntity
import com.project.application.entrypoint.credentiedPlaces.repository.entity.CredentiedPlaceEntity
import com.project.application.entrypoint.user.repository.entity.UserEntity
import javax.persistence.*

@Entity
@Table(name = "booking")
data class BookingEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    var user: UserEntity,
    @ManyToOne
    var car: CarEntity,
    @ManyToOne
    var pickUpPlace: CredentiedPlaceEntity,
    @ManyToOne
    var deliveryPlace: CredentiedPlaceEntity?,
    var price: Double,
)