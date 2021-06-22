package ch27.collection.set

/**
 * @author : choi-ys
 * @date : 2021/06/22 10:24 오후
 * @apiNote : Kotlin 자료구조 : Set
 */
fun main() {
    val mutableSet:MutableSet<String> = mutableSetOf("귤", "바나나", "키위")

    for (item in mutableSet) {
        println("${item}")
    }

    mutableSet.add("자몽")
    println(mutableSet)

    mutableSet.remove("바나나")
    println(mutableSet)

    println(mutableSet.contains("귤"))
}