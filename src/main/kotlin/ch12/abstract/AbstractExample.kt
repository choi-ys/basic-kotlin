package ch12.abstract

/**
 * @author : choi-ys
 * @date : 2021/06/14 4:51 오후
 * @apiNote : 추상화 = 추상함수를 포함한 추상클래스
 *  - 추상 함수
 *    - 선언부만 존재, 기능의 구현은 해당 함수를 사용하는 클래스에서 직접 구현
 *  - 추상클래스의 목적
 *    - 슈퍼클래스에서 함수의 구체적인 구현은 없고, 각 서브클래스 비어있는 함수를 필요에 따라 구현하도록 하기 위함
 *  - 정리
 *    - 오버라이딩 : 이미 구현이 끝난 함수의 기능을 서브 클래스에서 변경해야 할떄
 *    - 추상화 : 형식만 선언, 실제 구현은 서브클래스에 일임
 *    - 인터페이스 : 서로다른 기능들을 여러개 물려줘야 할때
 */
fun main(){
    var rabbit: Rabbit = Rabbit()
    rabbit.eat()
    rabbit.sniff()
}

/**
 * abstract가 명시된 추상클래스는 일부 함수가 구현되지 않은 미완성 클래스이므로,
 * 단독으로는 인스턴스 생성이 불가능
 * 반드시 서브클래스에서 상속을 받아 abstract가 명시된 함수들을 구현해야함
 */
abstract class Animal {
    /**
     * 구현없이 선언만 존재하는 추상 함수
     */
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit() : Animal(){
    /**
     * 슈퍼클래스의 추상함수를 override하여 구현
     */
    override fun eat() {
        println("당근을 먹습니다.")
    }
}