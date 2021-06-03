package com.samuel.movify.controllers

import com.samuel.movify.models.Movie
import com.samuel.movify.repositories.MovieRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("movies")
class MovieController(private var movieRepository: MovieRepository) {

    @GetMapping("/list")
    fun listMovies(): ResponseEntity<List<Movie>> {
        return ResponseEntity.ok(this.movieRepository.findAll())
    }

}