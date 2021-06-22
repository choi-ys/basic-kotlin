package ch01.variable

/**
 * @author : choi-ys
 * @date : 2021/06/13 5:46 오후
 * @apiNote : Kotlin의 숫자형 기본 자료형
 *  - Byte : 8bits
 *  - Short : 16bits
 *  - Int : 32Bits
 *  - Long : 64bits
 */
fun main(){

    /**
     * Kotlin의 정수형 변수
     *  - Int
     *  - Long
     */
    var intValue: Int = 123
    var intValueByHex: Int = 0x1af // prefix '0x'를 이용한 16진법 표기
    var intValueByBinary: Int = 0b10110110 // prefix '0B'를 이용한 2진법 표기
    var longValue: Long = 123L // suffix 'L'을 이용한 Long Type 표기
    println("intValue : "+ intValue)
    println("intValueByHex : " + intValueByHex)
    println("intValueByBinary : " + intValueByBinary)
    println("longValue : " + longValue)
    println()

    /**
     * Kotlin의 실수형 변수
     *  - Double
     *  - Float
     */
    var doubleValue: Double = 12.3
    var doubleValueWithExponential: Double = 12.3e10 // 지수 표기법
    var floatValue: Float = 12.3F // suffix에 'F'를 이용한 Float Type 표기
    println("doubleValue : " + doubleValue)
    println("doubleValueWithExponential : " + doubleValueWithExponential)
    println("floatValue : " + floatValue)
    println()

    // Integer 변수의 선언 및 초기화
    var integerVariable: Int = 123
    println(integerVariable)

    // Nullable 타입의 Integer
    var nullableVariable: Int? = null
    println(nullableVariable)
}