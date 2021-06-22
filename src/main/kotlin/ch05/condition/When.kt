package ch05.condition

/**
 * @author : choi-ys
 * @date : 2021/06/14 11:46 오전
 * @apiNote : when문 : switch문을 대체하는 다중 조건문
 *  - if문 : 참과 거짓만을 비교
 *  - when문 : 하나의 변수를 여러개의 값과 비교
 *  - 주의사항
 *    - 여러개의 조건이 부합하는 경우 가장 먼저 선언된 조건이 수행
 */
fun main(){
    var intValue: Any = '가'
    doWhenAsCondition(intValue)
    println(doWhenAsExpression(intValue))
}

/**
 * 조건문으로서의 when
 *  - when문의 조건에 부합하는 동작을 수행
 * Any : 어떤 자료형과도 호환되는 코틀린의 최상위 자료형
 */
fun doWhenAsCondition(input: Any){
    when(input){
        is Int -> println("Integer Type 변수 입니다.")
        is Long -> println("Long Type 변수 입니다.")
        is String -> println("String Type 변수 입니다.")
        1 -> println("값은 1입니다.")
        else -> println("만족하는 조건이 존재하지 않습니다.")
    }
}

/**
 * 표현식으로서의 when
 *  - when문의 조건에 부합하는 동작 대신 값을 반환
 */
fun doWhenAsExpression(input: Any):Any {
    return when(input){
        is Int -> "Integer Type 변수 입니다."
        is Long -> "Long Type 변수 입니다."
        is String -> "String Type 변수 입니다."
        1 -> "값은 1입니다."
        else -> "만족하는 조건이 존재하지 않습니다."
    }
}