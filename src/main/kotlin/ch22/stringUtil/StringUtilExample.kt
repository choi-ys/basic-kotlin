package ch20.stringUtil

/**
 * @author : choi-ys
 * @date : 2021/06/22 10:39 오전
 * @apiNote : Kotlin의 문자열을 다루는 util 함수#1
 *  - toLowerCase : 문자열 전체를 소문자로 변환
 *  - toUpperCase : 문자열 전체를 대문자로 변환
 *  - split : 특정 구분자를 기준으로 문자열을 분리하여 배열로 반환
 *  - joinToString :
 *    - 문자열 배열을 하나의 문자열로 반환
 *    - 파라미터가(String) 있는 경우 각 배열의 원소 사이에 파라미터를 구분자로 취함
 *  - substring(startIndex: Int, lastIndex: Int)
 *    - 문자열의 위치에서 startIndex부터 lastIndex까지의 문자열을 반환
 *    - startIndex와 lastIndex를 포함하며 startIndex는 0부터 시작
 */
fun main() {
    var text1 = "Test.Kotlin.String"
    println(text1.length)

    println(text1.toLowerCase())
    println(text1.toUpperCase())

    val text2 = text1.split('.')
    println(text2)

    println(text2.joinToString())
    println(text2.joinToString("-"))

    println(text1.substring(5..10))
}