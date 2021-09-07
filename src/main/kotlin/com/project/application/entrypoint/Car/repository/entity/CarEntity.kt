package com.project.application.entrypoint.Car.repository.entity

import com.project.application.entrypoint.booking.repository.entity.BookingEntity
import java.time.Year
import javax.persistence.*

@Entity
@Table(name = "car")
data class CarEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val releaseYear: Year,
    val licensePlate: String,
    val brand: String,
    val type: CarType,
    @OneToMany(mappedBy = "id")
    val booksingList: List<BookingEntity>
)

enum class CarType {
    SUV, SEDAN, HATCH, DELUXE, ARMORED
}