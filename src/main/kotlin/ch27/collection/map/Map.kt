package ch27.collection.map

/**
 * @author : choi-ys
 * @date : 2021/06/22 10:34 오후
 * @apiNote : Kotlin 자료구조 : Map
 */
fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf(
        "레드벨벳" to "음파음파",
        "트와이스" to "FANCY",
        "ITZY" to "ICY"
    )

    for (entry in mutableMap){
        println("${entry.key} : ${entry.value}")
    }

    mutableMap.put("오마이걸", "번지")
    println(mutableMap)

    mutableMap.remove("ITZY")
    println(mutableMap)

    print(mutableMap["레드벨벳"])
}