# Kotest 연습하기

https://kotest.io/

### Environment

- kotest 5.5.4
- kotest-extensions-spring 1.1.2

## Behavior Spec [code](https://github.com/Hyune-s-lab/sample-kotest/blob/main/src/test/kotlin/com/hyune/samplekotest/sample/SimpleBehaviorSpecTest.kt)

https://kotest.io/docs/framework/testing-styles.html#behavior-spec

## Describe Spec [code](https://github.com/Hyune-s-lab/sample-kotest/blob/main/src/test/kotlin/com/hyune/samplekotest/sample/SimpleBehaviorSpecTest.kt)

https://kotest.io/docs/framework/testing-styles.html#describe-spec

## api 호출 [code](https://github.com/Hyune-s-lab/sample-kotest/blob/main/src/test/kotlin/com/hyune/samplekotest/sample/FakeApiRequestTest.kt)

https://jsonplaceholder.typicode.com/

- fake api 사이트를 통해 json 테스트
    - webflux 활용
- json array assertion 에 대한 학습이 더 필요합니다.
    - https://kotest.io/docs/assertions/json/json-overview.html

## 실행 시간 측정 [code](https://github.com/Hyune-s-lab/sample-kotest/blob/main/src/test/kotlin/com/hyune/samplekotest/sample/MeasureTimeTest.kt)

https://www.baeldung.com/kotlin/measure-elapsed-time

- JUnit 에는 Stopwatch 가 있습니다.

## Logging [code](https://github.com/Hyune-s-lab/sample-kotest/blob/main/src/main/kotlin/com/hyune/samplekotest/service/SampleLoggingService.kt)

```kotlin
private val log = LoggerFactory.getLogger(javaClass)
```
