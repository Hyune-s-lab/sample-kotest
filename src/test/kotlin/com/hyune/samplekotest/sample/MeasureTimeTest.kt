package com.hyune.samplekotest.sample

import io.kotest.core.spec.style.FunSpec
import org.springframework.boot.test.context.SpringBootTest
import kotlin.random.Random
import kotlin.system.measureTimeMillis

@SpringBootTest
class MeasureTimeTest : FunSpec({
    test("measureTimeTest") {
        val elapsed = measureTimeMillis {
            Thread.sleep(Random.nextLong(100, 1000))
        }
        println("""### execute time = $elapsed ms""")
    }
})

