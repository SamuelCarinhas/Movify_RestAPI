package com.samuel.movify.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User (

    @Id
    val id: String? = null,

    @Indexed(unique = true)
    val username: String,

    val password: String,

    val fullName: String? = null,

    val img: String? = null,

    val role: Role? = null
)