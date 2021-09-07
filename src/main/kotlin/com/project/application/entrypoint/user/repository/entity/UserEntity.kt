package com.project.application.entrypoint.user.repository.entity

import com.project.domain.user.entity.DocumentType
import javax.persistence.*

@Entity
@Table(name = "user")
data class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val documentNumber: String,
    val documentType: DocumentType
)