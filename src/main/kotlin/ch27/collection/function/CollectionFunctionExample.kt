package ch27.collection.function

/**
 * @author : choi-ys
 * @date : 2021/06/23 11:16 오전
 * @apiNote : Kotlin Collection Function#1
 *  - forEach
 *  - filter
 *  - map
 *  - any, all, none
 *  - first, firstOrNull, find
 *  - last, lastOrNull, findLast
 *  - count
 */
fun main() {
    var nameList: List<String> = listOf(
        "최용석",
        "기호창",
        "이성욱",
        "박재현",
        "전성원",
        "김진태",
        "이하은",
        "김태훈",
        "권성준",
    )

    nameList.forEach{
        print(it + ", ")
    }
    println()

    println("nameList.filter { it.startsWith(\"최\") } -> "  + nameList.filter { it.startsWith("최") })
    println("nameList.map { \"이름 : \" + it } -> " + nameList.map { "이름 : " + it })
    println()

    println("nameList.any { it == \"기호창\" } -> " + nameList.any { it == "기호창" })
    println("nameList.all { it.length == 3 } -> " + nameList.all { it.length == 3 })
    println("nameList.none { it.startsWith(\"나\") } -> " + nameList.none { it.startsWith("나") })
    println()

    println("nameList.first() -> " + nameList.first())
    println("nameList.firstOrNull() -> " + nameList.firstOrNull())
    println("nameList.first { it.startsWith(\"김\")} -> " + nameList.first { it.startsWith("김")})
    println("nameList.find { it.startsWith(\"김\") } -> " + nameList.find { it.startsWith("김") })
    println("nameList.firstOrNull { it.startsWith(\"나\") } -> " + nameList.firstOrNull { it.startsWith("나") })
    println()

    println("nameList.last() -> " +nameList.last())
    println("nameList.lastOrNull() -> " + nameList.lastOrNull())
    println("nameList.last { it.startsWith(\"김\") } -> " + nameList.last { it.startsWith("김") })
    println("nameList.findLast { it.startsWith(\"김\") } -> " + nameList.findLast { it.startsWith("김") })
    println("nameList.lastOrNull { it.startsWith(\"나\")} -> " + nameList.lastOrNull { it.startsWith("나")})
    println()

    println("nameList.count() -> " + nameList.count())
    println("nameList.count { it.startsWith(\"김\") } -> " + nameList.count { it.startsWith("김") })
}
