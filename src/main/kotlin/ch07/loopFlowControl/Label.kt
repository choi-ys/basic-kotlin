package ch07.loopFlowControl

/**
 * @author : choi-ys
 * @date : 2021/06/14 1:28 오후
 * @apiNote : label =
 *  - 사용 :
 *    {label name}@for () {
 *        break@{label name}
 *    }
 *  - 다중 반복문에서 break나 continue가 적용되는  label을 통해 지정할 수 있는 기능
 */
fun main(){
    beforeLabel()
    println()
    label()
}

fun beforeLabel(){
    // i==2, j==3인 경우 반복문을 종료
    for(i in 0..10){
        for(j in 0..10){
            if(i==2 && j==3) {
                println("i -> $i, j -> $j : 반복문 종료")
                break
            }
        }
        if(i==2) {
            break
        }
        println("i -> $i 반복문")
    }
}

fun label(){
    breakLabel@for(i in 0..10){
        for(j in 0..10){
            if(i==2 && j==3){
                println("i -> $i, j -> $j : lebel을 이용한 반복문 종료")
                break@breakLabel
            }
        }
        println("i -> $i 반복문")
    }
}