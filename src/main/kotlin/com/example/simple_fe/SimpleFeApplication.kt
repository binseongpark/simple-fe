package com.example.simple_fe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleFeApplication

fun main(args: Array<String>) {
	runApplication<SimpleFeApplication>(*args)
}
