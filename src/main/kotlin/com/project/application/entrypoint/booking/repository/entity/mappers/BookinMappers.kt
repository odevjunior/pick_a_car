package com.project.application.entrypoint.booking.repository.entity.mappers

import com.project.application.entrypoint.booking.repository.entity.BookingEntity
import com.project.domain.booking.entity.Booking
import org.mapstruct.Mapper

@Mapper
interface BookinMappers {
    fun toEntity(booking: Booking) : BookingEntity
    fun toDomain(bookingEntity: BookingEntity): Booking
}