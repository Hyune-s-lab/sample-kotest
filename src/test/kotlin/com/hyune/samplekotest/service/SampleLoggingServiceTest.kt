package com.hyune.samplekotest.service

import io.kotest.core.spec.style.FunSpec
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SampleLoggingServiceTest(private val sampleLoggingService: SampleLoggingService) : FunSpec({
    test("logging") {
        sampleLoggingService.logging()
    }
})
