package com.samuel.movify.controllers

import com.samuel.movify.models.User
import com.samuel.movify.repositories.UserRepository
import com.samuel.movify.requests.UserRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController(private var userRepository: UserRepository) {

    @PostMapping("/register")
    fun registerUser(@RequestBody userRequest : UserRequest): ResponseEntity<User> {

        val user = User(
            username = userRequest.username,
            password = userRequest.password
        )

        userRepository.save(user)

        return ResponseEntity(HttpStatus.CREATED);
    }

}
