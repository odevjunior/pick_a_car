package com.project.application.entrypoint.Car.repository.mappers

import com.project.application.entrypoint.user.repository.entity.UserEntity
import com.project.domain.user.entity.User
import org.mapstruct.Mapper

@Mapper
interface UserMappers {
    fun toEntity(user: User): UserEntity
    fun toDomain(userEntity: UserEntity): User
}