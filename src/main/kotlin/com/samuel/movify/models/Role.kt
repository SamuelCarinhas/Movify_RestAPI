package com.samuel.movify.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Role {

    @Id
    var _id = ""

    var name = ""

    var description = ""

}