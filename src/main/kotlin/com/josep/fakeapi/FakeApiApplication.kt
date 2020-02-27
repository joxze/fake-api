package com.josep.fakeapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FakeApiApplication

fun main(args: Array<String>) {
    runApplication<FakeApiApplication>(*args)
}
