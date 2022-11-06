package exception

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec

internal class ExceptionHandlerFunctionTest : StringSpec({
    "require()는 매개변수 값이 거짓인 경우, IllegalArgumentException을 발생시킨다." {
        val given = "".isNotEmpty()
        shouldThrow<IllegalArgumentException> { require(given) { "Required function is false" } }
    }

    "requireNotNull()는 매개변수 값이 null인 경우, IllegalArgumentException을 발생시킨다." {
        shouldThrow<IllegalArgumentException> { requireNotNull(null) { "Required value is null" } }
    }

    "check()는 매개변수 값이 거짓인 경우, IllegalStateException을 발생시킨다." {
        shouldThrow<IllegalStateException> { check(false) { "Required value is false" } }
    }

    "checkNotNull()는 매개변수 값이 null인 경우, IllegalStateException을 발생시킨다." {
        shouldThrow<IllegalStateException> { checkNotNull(null) { "Required value is false" } }
    }
})
