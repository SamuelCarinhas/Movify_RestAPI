package com.samuel.movify

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MovifyApplication

fun main(args: Array<String>) {
    runApplication<MovifyApplication>(*args)
}
