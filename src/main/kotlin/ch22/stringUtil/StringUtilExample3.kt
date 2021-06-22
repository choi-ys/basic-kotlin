package ch20.stringUtil

/**
 * @author : choi-ys
 * @date : 2021/06/22 10:39 오전
 * @apiNote : Kotlin의 문자열을 다루는 util 함수#2
 *  - startsWith(keyword: String) : 해당 문자열이 지정한 keyword로 시작하면 true를 반환
 *  - endsWith(keyword: String) : 해당 문자열이 지정한 keyword로 끝나면 true를 반환
 *  - contains(keyword: String) : 해당 문자열이 지정한 keyword를 포함하면 true를 반환
 */
fun main() {
    var text3 = "kotlin.kt"
    var text4 = "java.java"

    println("$text3 -> startsWith(\"java\") : " + text3.startsWith("java"))
    println("$text4 -> startsWith(\"java\") : " + text4.startsWith("java"))

    println()

    println("$text3 -> endsWith(\".kt\") : " + text3.endsWith(".kt"))
    println("$text4 -> endsWith(\".kt\") : " + text4.endsWith(".kt"))

    println()

    println("$text3 -> contains(\"lin\") : " + text3.contains("lin"))
    println("$text4 -> contains(\"lin\") : " + text4.contains("lin"))
}