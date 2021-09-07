package com.project.domain.booking.useCase

import com.project.domain.booking.entity.Booking

interface BookingUseCase {
    fun bookACar(booking: Booking): Booking
}