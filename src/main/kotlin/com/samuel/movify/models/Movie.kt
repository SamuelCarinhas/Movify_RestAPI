package com.samuel.movify.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "movies")
data class Movie (

    @Id
    val _id: String? = null,

    @Indexed(unique = true)
    val title: String,

    val description: String,

    val img: String
)