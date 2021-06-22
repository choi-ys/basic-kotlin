package ch12.abstract

/**
 * @author : choi-ys
 * @date : 2021/06/14 5:30 오후
 * @apiNote : 인터페이스 : 추상함수로만 이루어져있는 순수 추상화 기능
 *  - Kotlin에서는 인터페이스 내에 추상함수와 함께 일반함수를 가질수 있음
 *    - 구현부가 있는 함수 : open 함수로 간주되어 open 키워드 생략가능
 *    - 구현부가 없는 함수 : abstract 함수로 간주되어 abstract 키워드 생략가능
 *  - 다만 인터페이스는 생성자를 가질수 없음
 *  - 서브클래스는 여러 인터페이스를 상속 받아 유연한 설계가 가능
 */
fun main(){
    var dog: Dog = Dog()
    dog.run()
    dog.eat()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat(){
        print("음식을 먹습니다.")
    }
}

class Dog() : Runner, Eater{
    override fun run() {
        println("우다다다다다")
    }

    override fun eat() {
        println("냠냠")
    }

}