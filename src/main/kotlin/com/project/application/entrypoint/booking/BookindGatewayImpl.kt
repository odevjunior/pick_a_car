package com.project.application.entrypoint.booking

import com.project.application.entrypoint.Car.repository.CarRepository
import com.project.application.entrypoint.booking.repository.BookingRepository
import com.project.application.entrypoint.booking.repository.entity.mappers.BookinMappers
import com.project.application.entrypoint.credentiedPlaces.repository.CredentiedPlaceRepository
import com.project.application.entrypoint.user.repository.UserRepository
import com.project.domain.booking.BookingGateway
import com.project.domain.booking.entity.Booking
import jakarta.inject.Singleton

@Singleton
class BookindGatewayImpl(
    private val credentiedPlaceRepository: CredentiedPlaceRepository,
    private val bookingRepository: BookingRepository,
    private val carRepository: CarRepository,
    private val userRepository: UserRepository,
    private val bookingMapper: BookinMappers
): BookingGateway {
    override fun makeABooking(booking: Booking): Booking {
        return bookingMapper.toDomain(bookingRepository.save(bookingMapper.toEntity(booking)));
    }
}