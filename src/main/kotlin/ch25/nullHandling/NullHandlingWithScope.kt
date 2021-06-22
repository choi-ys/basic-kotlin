package ch25.nullHandling

/**
 * @author : choi-ys
 * @date : 2021/06/22 5:33 오후
 * @apiNote : nullable 변수에서 null을 처리하는 방법
 */
fun main() {

    var nullableString: String? = null

    /**
     * scope 함수를 이용한 null safe operator의 사용
     * nullableString변수가 null이므로 scope 함수 전체가 수행되지 않음
     */
    nullableString?.run {
        println(toUpperCase())
        println(toLowerCase())
    }

    var notNullString: String = "Kotlin example"
    notNullString?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
}