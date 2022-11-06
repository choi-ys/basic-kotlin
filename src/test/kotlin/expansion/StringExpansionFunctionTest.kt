package expansion

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StringExpansionFunctionTest : StringSpec({
    val format = "value : %s"
    val value = "some value"
    val expected = "value : some value"
    
    "AS-IS:Java String.format을 사용한 문자열 처리" {
        val given = String.format(format, value)
        given shouldBe expected
    }

    "TO-BE:Kotlin String 확장 함수 format을 사용한 문자열 처리" {
        val given = format.format(value)
        given shouldBe expected
    }
})
