package com.hyune.samplekotest.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class SampleLoggingService {
    private val log = LoggerFactory.getLogger(javaClass)

    fun logging() {
        log.info("### hello")
    }
}
