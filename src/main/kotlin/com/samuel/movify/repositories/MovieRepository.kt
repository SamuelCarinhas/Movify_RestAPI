package com.samuel.movify.repositories

import com.samuel.movify.models.Movie
import org.springframework.data.mongodb.repository.MongoRepository

interface MovieRepository: MongoRepository<Movie, String> {
    
}