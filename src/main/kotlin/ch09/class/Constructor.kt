package ch09.`class`

import java.time.LocalDateTime

/**
 * @author : choi-ys
 * @date : 2021/06/14 3:00 오후
 * @apiNote : 생성자 = 새로운 인스턴스를 만들기 위해 호출하는 class의 함수
 *  - 클래스의 생성자를 호출하면 새로운 인스턴스를 반환 받을 수 있다.
 *  - 생성자의 역할
 *    - 인스턴스의 속성을 초기화
 *    - 인스턴스 생성시 필요한 구문을 수행 (init)
 *  - init 함수
 *    - 파라미터나 반환형이 없는 함수로 생성자를 통해 인스턴스가 생성될때 호출되는 함수
 *  - 기본 생성자 : 클래스의 속성을 정의할때 기본으로 선언
 *  - 보조 생성자 : 필요에 따라 추가적으로 선언
 *    - 인스턴시 생성 시 편의를 제공하거나, 추가적인 구문을 수행하는 기능 제공
 *    - constructor() 키워드를 이용하여 생성
 *    - 반드시 기본 생성자를 통해 속성을 초기화 :this(기본생성자가 필요로 하는 파라미터)
 */
fun main() {
    var initInstance: Constructor = Constructor("기본생성자를 이용한 인스턴스 생성", LocalDateTime.now());

    println()
    var constructorInstance: Constructor = Constructor("보조 생성자를 이용한 인스턴스 생성");
}

class Constructor(var message: String, val createdAt: LocalDateTime) {
    init{
        println("init 생성자 : 객체 생성시 호출 -> ${this.message}")
    }

    constructor(message: String) : this(message, LocalDateTime.now()){
        println("보조 생성자 : 명시적 호출")
    }
}