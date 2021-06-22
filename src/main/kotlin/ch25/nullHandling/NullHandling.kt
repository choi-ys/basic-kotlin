package ch25.nullHandling

/**
 * @author : choi-ys
 * @date : 2021/06/22 5:33 오후
 * @apiNote : nullable 변수에서 null을 처리하는 방법
 */
fun main() {
    var nullableString: String? = null

    println(nullableString?.toUpperCase())
    println(nullableString?:"default value".toUpperCase())
    println(nullableString!!.toUpperCase())
}