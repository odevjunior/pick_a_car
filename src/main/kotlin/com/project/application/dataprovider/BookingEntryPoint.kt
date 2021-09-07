package com.project.application.dataprovider

import com.project.domain.booking.entity.Booking
import com.project.domain.booking.useCase.BookingUseCase
import io.micronaut.http.HttpStatus
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpRequest
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller

@Controller("/book")
class BookingEntryPoint(
    private val bookingUseCase: BookingUseCase
) {
    fun bookACar(@Body bookingRequest: Booking):Any? {
        return try {
            HttpResponse.ok(bookingUseCase.bookACar(bookingRequest))
        } catch(e: Exception) {
            HttpResponse.badRequest(e.message)
            null
        }
    }
}