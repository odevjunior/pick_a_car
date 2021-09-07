package com.project.domain.booking.useCase

import com.project.domain.booking.BookingGateway
import com.project.domain.booking.entity.Booking

class BookingUseCaseImpl(
    private val bookingGateway: BookingGateway
): BookingUseCase {
    override fun bookACar(booking: Booking): Booking {
        try {
            return bookingGateway.makeABooking(booking);
        } catch(e: Exception) {
            throw e;
        }
    }

}