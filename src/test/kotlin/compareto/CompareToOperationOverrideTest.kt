package compareto

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class CompareToOperationOverrideTest : BehaviorSpec({
    given("class에 Comparable 인터페이스의 compareTo 연산자를 오버라이드 하면") {
        val origin = CompareToTargetClass(2)
        val target = CompareToTargetClass(1)
        `when`("원시 타입이 아닌 경우에도 ") {
            val actual = origin > target
            then(">, <, <=, >= 기호를 사용할 수 있다.") {
                actual shouldBe true
            }
        }
    }
})
