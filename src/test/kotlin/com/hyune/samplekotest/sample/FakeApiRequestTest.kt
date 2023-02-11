package com.hyune.samplekotest.sample

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldNotBe
import org.json.JSONArray
import org.json.JSONTokener
import org.springframework.web.client.RestTemplate

class FakeApiRequestTest(restTemplate: RestTemplate = RestTemplate()) : DescribeSpec({
    describe("fake api - /users 호출") {
        val then = restTemplate.getForObject(
            "https://jsonplaceholder.typicode.com/users", String::class.java
        )

        it("jsonArray 로 변환 후 확인") {
            val jsonArray = JSONTokener(then).nextValue() as JSONArray

            (0 until jsonArray.length()).forEach { i ->
                val id = jsonArray.getJSONObject(i).getString("id")
                id shouldNotBe null

                val name = jsonArray.getJSONObject(i).getString("name")
                name shouldNotBe null

                val email = jsonArray.getJSONObject(i).getString("email")
                email shouldNotBe null
            }

            println(jsonArray)
        }
    }
})
