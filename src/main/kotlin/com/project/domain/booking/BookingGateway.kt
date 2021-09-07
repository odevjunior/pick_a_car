package com.project.domain.booking

import com.project.domain.booking.entity.Booking


interface BookingGateway {
    fun makeABooking(booking: Booking): Booking
}