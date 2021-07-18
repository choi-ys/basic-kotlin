package ch27.collection.function

/**
 * @author : choi-ys
 * @date : 2021/06/23 11:49 오전
 * @apiNote : Kotlin Collection Function#3
 *  - flatMap
 *  - getOrElse
 *  - zip
 */
fun main() {
    val numberList = listOf(-3, 7, 2, -10, 1)
    println(numberList)
    println()

    println(numberList.flatMap { listOf(it*10, it+10) })
    println()

    println(numberList.getOrElse(1) { 50 })
    println(numberList.getOrElse(10) { 50 })
    println()

    val nameList = listOf("A", "B", "C", "D")
    println(nameList zip numberList)
}