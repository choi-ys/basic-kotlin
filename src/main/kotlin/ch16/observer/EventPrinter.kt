package ch16.observer

/**
 * @author : choi-ys
 * @date : 2021/06/18 5:28 오후
 * @apiNote : 발생되는 이벤트 처리를 위한 CountEventListener Interface구현 및 이벤트를 수신해서 출력
 */
class EventPrinter : CountEventListener {

    /**
     * event를 발생시킨 Counter Class의 count 함수에서 넘겨준 파라미터를 받아 출력
     */
    override fun onCountEvent(count: Int) {
        print("${count}-")
    }

    fun start(){
        /**
         * event를 발생시키는 Counter 인스턴스를 생성
         * this keyword를 이용하여 CountEventListener의 구현부인 onCountEvent를 파라미터로 전달
         *  - this 키워드를 이용하여 파라미터 전달시 EventPrinter Class가 전달되지만
         *    받는 쪽의 파라미터가 CountEventListener로 명시되어 있어 CountEventListener 구현부만 전달됨
         *    이를 객체지향의 다형성이라 한다.
         *     - 상속받아 만들어진 Class는 슈퍼클래스의 기능을 포함하여 제작되었으므로,
         *       슈퍼 클래스에서 정의한 부분만 따로 전달 가능
         */
        val counter = Counter(this)

        /**
         * event발생 부인 Couter Class의 count() 함수를 호출
         */
        counter.count()
    }

}