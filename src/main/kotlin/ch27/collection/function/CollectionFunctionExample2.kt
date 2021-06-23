package ch27.collection.function

/**
 * @author : choi-ys
 * @date : 2021/06/23 11:49 오전
 * @apiNote : Kotlin Collection Function#2
 *  - associateBy
 *  - groupBy
 *  - partition
 */
fun main() {
    var personList: List<Person> = listOf(
        Person("유나", 1992),
        Person("조이", 1996),
        Person("츄", 1999),
        Person("유나", 2003),
    )

    println(personList.associateBy { it.birthDay })
    println(personList.groupBy { it.name })
    println()

    val (over98, under98) = personList.partition { it.birthDay > 1998 }
    println(over98)
    println(under98)
}

data class Person(
    val name: String,
    val birthDay: Int
)