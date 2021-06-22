package ch05.condition

/**
 * @author : choi-ys
 * @date : 2021/06/14 11:35 오전
 * @apiNote : Kotlin의 분기문 #1 : if ~ else if ~ else 문
 *  - 비교연산자를 통해 분기
 *    - 부등호 : <, <=, >, >=, !=
 *    - 등호 : ==
 *    - 자료형이 맞는지 확인하는 is, !is
 */
fun main(){
    var intValue:Int = 7

    if(intValue > 10){
        println("intValue는 10 보다 큽니다.")
    } else if(intValue == 7) {
        println("intValue는 7입니다.")
    } else{
        println("intValue는 10 보다 작습니다.")
    }
}