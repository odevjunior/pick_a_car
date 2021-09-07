package com.project.application.entrypoint.user.repository

import com.project.application.entrypoint.user.repository.entity.UserEntity
import io.micronaut.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, Long>{
}