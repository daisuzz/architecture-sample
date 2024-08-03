package com.daisuzz.architecturesample.cqrs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CqrsArchitectureApplication

fun main(args: Array<String>) {
    runApplication<CqrsArchitectureApplication>(*args)
}
