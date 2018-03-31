package io.arukas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class SpringBootJpaApplication

fun main(args: Array<String>) {
    runApplication<SpringBootJpaApplication>(*args)
}
