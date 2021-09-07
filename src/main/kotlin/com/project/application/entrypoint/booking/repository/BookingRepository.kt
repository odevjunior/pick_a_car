package com.project.application.entrypoint.booking.repository

import com.project.application.entrypoint.booking.repository.entity.BookingEntity
import io.micronaut.data.jpa.repository.JpaRepository

interface BookingRepository: JpaRepository<BookingEntity, Long> {
}