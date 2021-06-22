package ch10.inheritance

/**
 * @author : choi-ys
 * @date : 2021/06/14 4:02 오후
 * @apiNote : 상속
 *  - 용도
 *    - 이미 존재하는 클래스를 확장하여 새로운 속성이나 기능을 추가한 클래스를 생성하기 위함
 *    - 이미 존재하는 여러 클래스의 공통점을 뽑아 코드 관리를 편하게 하기 위함
 *  - 용어
 *    - 슈퍼클래스 : 속성과 함수를 물려주는 클래스
 *    - 서브클래스 : 속성과 함수를 물려받는 클래스
 *  - 사용
 *    - 상속하려는 클래스에 open 키워드를 명시
 *    - 서브클래스 선언 뒤에 콜론(:)과 슈퍼클래스의 생성자를 명시하여 상속
 *      - EX) class sub(params) : super(params)
 *  - 주의사항
 *    - 서브클래스는 슈퍼클래스에 존재하는 속성과 '같은 이름'의 속성을 가질 수 없음
 *    - 서브클래스의 생성 시점에는 반드시 슈퍼클래스의 생성자를 호출되어야함
 *  - 장점 : 클래스의 구조적인 관리에 용이
 *  - 단점 : 지나친 상속구조는 코드의 복잡도를 증가시킴
 */

fun main(){

    var bird: Animal = Animal("까치", 1, "BIRD")
    bird.introduce()

    var dog: Dog = Dog("진돗개", 1)
    dog.introduce()
    dog.bark()

    var cat: Cat = Cat("고양이", 1)
    cat.introduce()
    cat.meow()
}

/**
 * 서브클래스의 공통 속성과 함수가 정의된 슈퍼클래스
 *  - open 키워드를 이용하여 공통 속성과 함수를 상속
 *  - 클래스의 속성을 선언할때 var/val을 이용하여 클래스 자체 속성으로 명시
 */
open class Animal(
    var name: String,
    var age: Int,
    var type: String
    ){
    fun introduce(){
        println("name : ${this.name}, age : ${this.age}, type: ${this.type}")
    }
}

/**
 * 서브 클래스는 슈퍼클래스와 동일한 속성을 가질 수 없으므로,
 * 인자를 받을 수는 있으나, var/val을 이용하여 클래스 자체 속성으로 명시가 불가능
 * 즉, 단순히 값을 넘겨받는 일반 파라미터로 받아, 슈퍼클래스의 생성자를 호출하는 시점에 파라미터를 넘겨
 * 슈퍼클래스에 명시된 공통 속성으로 사용한다.
 */
class Dog(
    name: String,
    age: Int
) : Animal(name, age, "DOG"){
    fun bark(){
        println("멍멍")
    }
}

class Cat(
    name: String,
    age: Int
) : Animal(name, age, "CAT"){
    fun meow(){
        println("야옹")
    }
}