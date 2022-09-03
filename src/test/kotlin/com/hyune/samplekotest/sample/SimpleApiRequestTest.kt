package com.hyune.samplekotest.sample

import io.kotest.core.spec.DisplayName
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldNotBe
import org.json.JSONArray
import org.json.JSONTokener
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.reactive.function.client.WebClient

@DisplayName("fake api 호출")
@SpringBootTest
class SimpleApiRequestTest : BehaviorSpec({

    Given("fake api url 설정") {
        val client = WebClient.builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .build()

        When("/users 호출") {
            val responseJson: String? = client.get()
                .uri("/users")
                .retrieve()
                .bodyToMono(String::class.java)
                .block()


            Then("jsonArray 로 변환 후 확인") {
                val jsonArray = JSONTokener(responseJson).nextValue() as JSONArray

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
    }
})
