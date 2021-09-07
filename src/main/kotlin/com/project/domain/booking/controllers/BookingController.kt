package com.project.domain.booking.controllers

import com.project.domain.booking.entity.Booking
import java.net.http.HttpResponse

interface BookingController {
    fun bookACar(booking: Booking): HttpResponse<Booking>
}