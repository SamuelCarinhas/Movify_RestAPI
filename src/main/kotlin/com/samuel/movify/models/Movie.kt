package com.samuel.movify.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Movie {

    @Id
    var _id = ""

    var title = ""

    var description = ""

    var img = ""
}