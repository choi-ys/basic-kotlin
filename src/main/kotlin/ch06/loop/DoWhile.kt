package ch06.loop

/**
 * @author : choi-ys
 * @date : 2021/06/14 12:10 오후
 * @apiNote : do while문 : 조건과 관계없이 반드시 한번 수행
 */
fun main(){
    var inputValue: Int = 0;
    do{
        println(inputValue++)
    } while(inputValue < 5)
}