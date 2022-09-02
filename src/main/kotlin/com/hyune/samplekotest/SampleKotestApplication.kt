package com.hyune.samplekotest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleKotestApplication

fun main(args: Array<String>) {
    runApplication<SampleKotestApplication>(*args)
}
