package ch16.observer

/**
 * @author : choi-ys
 * @date : 2021/06/18 5:28 오후
 * @apiNote : 이벤트를 발생시키는 Counter와 이벤트를 처리할 EventPrinter를 연결, 이벤트가 발생할 떄 숫자를 반환
 */
interface CountEventListener {
    /**
     * Interface의 추상 함수
     */
    fun onCountEvent(count: Int)
}