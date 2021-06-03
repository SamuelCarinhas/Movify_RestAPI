package com.samuel.movify.seeders

import com.samuel.movify.models.Movie
import com.samuel.movify.repositories.MovieRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class MovieSeeder(private val movieRepository: MovieRepository) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        /*val movie = Movie(title = "Avengers: Endgame",
        description = "The grave course of events set in motion by Thanos that wiped out half the universe and fractured the Avengers ranks compels the remaining Avengers to take one final stand in Marvel Studios' grand conclusion to twenty-two films, \"Avengers: Endgame.\"",
        img = "https://upload.wikimedia.org/wikipedia/pt/9/9b/Avengers_Endgame.jpg")
        this.movieRepository.save(movie)*/
    }

}