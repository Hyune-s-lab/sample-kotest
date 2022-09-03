package com.hyune.samplekotest.sample

import io.kotest.core.spec.DisplayName
import io.kotest.core.spec.style.BehaviorSpec
import org.springframework.boot.test.context.SpringBootTest

@DisplayName("SimpleBehaviorSpecTest")
@SpringBootTest
class SimpleBehaviorSpecTest : BehaviorSpec({
    Given("a broomstick") {
        When("I sit on it") {
            Then("I should be able to fly") {
                // test code
                println("### 111")
            }
        }
        When("I throw it away") {
            Then("it should come back") {
                // test code
                println("### 222")
            }
        }
    }
})
