package ch07.loopFlowControl

/**
 * @author : choi-ys
 * @date : 2021/06/14 1:43 오후
 * @apiNote : countinue, break : 반복문 흐름 제어
 *  - return : 함수를 종료하고 값을 반환
 *  - break : 반복문 내의 구문이 실행되는 중간에 즉시 반복문을 종료하고 다음 구문으로 이동
 *  - continue : 다음 반복조건으로 즉시 이동
 */
fun main(){
    continueAndBreak()
}

fun continueAndBreak(){
    for (i in 0..9 step 1){
        if(i==3){
            println("다음 반복 조건으로 이동")
            continue
        }
        if(i==6){
            println("조건문 종료")
            break
        }
        println(i)
    }
}