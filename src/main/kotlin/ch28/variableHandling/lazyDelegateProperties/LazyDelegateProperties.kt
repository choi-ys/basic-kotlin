package ch28.variableHandling.lazyDelegateProperties

/**
 * @author : choi-ys
 * @date : 2021/06/23 3:12 오후
 * @apiNote : Kotlin 지연대리자 속성 : lazy delegate properties
 */
fun main() {
    val number:Int by lazy {
        println("변수를 초기화 합니다.")
        7
    }

    println("코드를 시작합니다.")
    println(number)
    println(number)
}