package ch20.stringUtil

/**
 * @author : choi-ys
 * @date : 2021/06/22 10:39 오전
 * @apiNote : Kotlin의 문자열을 다루는 util 함수#2
 *  - isNullOrEmpty : 해당 문자열이 null이거나 ""(empty:빈문자열)인 경우 true를 반환
 *  - isNullOrBlank : 해당 문자열이 null이거나 ""(empty)이거나 " "(blank:공백문자열)인경우 true를 반환
 *    - 공백문자
 *      - spcae
 *      - tab
 *      - line feed
 *      - carriage return
 */
fun main() {
    val nullString: String? = null
    val emptyString =""
    val blankString = " "
    val normalString = "text"

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())
}