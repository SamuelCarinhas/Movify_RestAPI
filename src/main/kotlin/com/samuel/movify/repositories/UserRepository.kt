package com.samuel.movify.repositories

import com.samuel.movify.models.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String> {

}