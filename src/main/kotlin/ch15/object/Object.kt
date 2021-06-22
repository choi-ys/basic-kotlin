package ch15.`object`

/**
 * @author : choi-ys
 * @date : 2021/06/18 4:58 오후
 * @apiNote : Kotlin Object
 *  - class와 달리 인스턴스를 생성하지 않고 사용 가능
 *    - Object명에 직접 참조연산자를 통해 접근
 *  - '최초 사용 시' 자동으로 생성되며, 이후 Application 전역에서 공유하여 사용 가능
 */
fun main(){
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)
}

object Counter{
    var count = 0;

    fun countUp(){
        count++
    }

    fun clear(){
        count = 0
    }
}