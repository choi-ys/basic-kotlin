package ch06.loop

/**
 * @author : choi-ys
 * @date : 2021/06/14 12:03 오후
 * @apiNote : for : 명시된 반복 범위내에서 반복을 수행
 */
fun main(){
    /**
     * step : 증가
     * downTo : 감소
     */
    for (i in 0..9 step 1){
        println(i)
    }
}