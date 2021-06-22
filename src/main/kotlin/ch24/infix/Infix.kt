package ch23.overloading

/**
 * @author : choi-ys
 * @date : 2021/06/22 5:26 오후
 * @apiNote : kotlin infix function
 *  - 연산자와 같이 함수를 사용할 수 있는 Infix
 */
fun main() {
    /**
     * infix 함수를 호출하는 방법
     */
    println(6 multiply 4)
    println(6.multiply(4))
}

/**
 * 주의 사항
 *  - 함수 정의시 infix 키워드를 prefix로 명시
 *  - 해당 함수가 적용될 자료형.이름 으로 함수 명명
 */
infix fun Int.multiply(x: Int): Int = this * x