package com.hyune.samplekotest.sample

import io.kotest.core.spec.style.DescribeSpec
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SimpleDescribeSpecTest : DescribeSpec({
    describe("a broomstick") {
        context("I sit on it") {
            it("I should be able to fly") {
                // test code
                println("### 111")
            }
        }
        context("I throw it away") {
            it("it should come back") {
                // test code
                println("### 222")
            }
        }
    }
})
