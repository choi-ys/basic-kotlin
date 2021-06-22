package ch23.overloading

/**
 * @author : choi-ys
 * @date : 2021/06/22 5:08 오후
 * @apiNote : Kotlin vararg
 *  - 같은 자료형을 개수에 상관없이 파라미터로 받고 싶을 때 사용하는 variable number of arguments
 *  - vararg는 개수가 지정되지 않은 파라미터를 받을 수 있으므로 반드시 함수의 파라미터 제일 끝에 위치하여야 함
 */
fun main() {
    sum(1, 2, 3, 4)
}

fun sum(vararg numbers: Int){
    var sum = 0
    for (number in numbers){
        sum += number
    }
    print(sum)
}