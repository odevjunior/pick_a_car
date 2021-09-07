package com.project.domain.user.entity

data class User (
    val id: Long,
    val name: String,
    val documentNumber: String,
    val documentType: DocumentType
)

enum class DocumentType {
    RG, CPF
}