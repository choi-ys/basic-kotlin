package ch16.observer

/**
 * @author : choi-ys
 * @date : 2021/06/18 5:42 오후
 * @apiNote : 인터페이스를 구현한 객체를 코드 중간에 익명객체로 즉시 생성하여 사용 가능
 */
class EventPrinterByAnonymousObject {
    fun start(){
        val counter = Counter(object:CountEventListener{
            override fun onCountEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}