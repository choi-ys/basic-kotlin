package ch02.typeCasting

/**
 * @author : choi-ys
 * @date : 2021/06/13 6:37 오후
 * @apiNote : Kotlin의 Type Casting 예제
 *  - 하나의 변수에 지정된 자료형을 호환되는 다른 자료형으로 변경
 *  - 기본자료형은 자료형 간의 형변환을 지원하기 위해 형변환 함수(Type Casting Function)를 제공 (명시적 형변환)
 *    - Kotlin의 기본자료형
 *      - 숫자형 : Byte, Float, Short, Double, Int, Long
 *      - 문자형 : Char
 *    - Kotlin 기본자료형의 형변환 함수
 *      - toByte(), toShort(), toInt(), toLong(), toDouble(), toChar()
 *  - Kotlin은 형변환시 발생할 수 있는 오류를 막기 위해 '묵시적 형변환'은 제공하지 않음
 */
fun main(){
    var intValue: Int = 54321
    var longValue: Long = intValue.toLong()
    var doubleValue: Double = intValue.toDouble()

    println("intValue : " + intValue + " || type : " + intValue::class.javaPrimitiveType)
    println("longValue : " + longValue + " || type : " + longValue::class.javaPrimitiveType)
    println("doubleValue : " + doubleValue + " || type : " + doubleValue::class.javaPrimitiveType)
}