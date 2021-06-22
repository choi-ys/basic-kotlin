package ch06.loop

/**
 * @author : choi-ys
 * @date : 2021/06/14 12:03 오후
 * @apiNote : do while문 : 조건이 참인경우 반복을 유지
 *  - while(반복 조건) {
 *        반복 내용
 *    }
 *  - 증감 연산자
 *    - 전위 연산자 : ++variable, --variable,
 *    - 후위 연산자 : variable++, variable--
 */
fun main() {
    var intValue: Int = 0
    while (intValue < 5) {
        println(intValue++)
    }
}