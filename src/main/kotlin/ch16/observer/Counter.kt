package ch16.observer

/**
 * @author : choi-ys
 * @date : 2021/06/18 5:28 오후
 * @apiNote : 숫자를 카운트하며 5의 배수마다 이벤트를 발생
 */

/**
 * 이벤트를 발생시키기 위해 생성자에서 CountEventListener를 속성으로 정의
 */
class Counter (var listener: CountEventListener){

    fun count(){
        for (i in 1..100){
            /**
             * 5의 배수마다 CountEventListener의 onCountEvent를 호출
             */
            if(i % 5 == 0)
                listener.onCountEvent(i)
        }
    }
}