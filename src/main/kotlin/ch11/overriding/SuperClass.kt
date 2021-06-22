package ch11.overriding

/**
 * @author : choi-ys
 * @date : 2021/06/14 4:18 오후
 * @apiNote : Overriding = 슈퍼클래스에 명시된 함수를 서브클래스에서 재구현
 *  슈퍼클래스와 서브클래스의 상속 관계에서,
 *  서브클래스는 슈퍼클래스에 있는 함수와 같은 이름과 형태를 가진 함수 생성 불가능
 *  오버라이딩이라는 방법으로 서브클래스에서 같은 이름과 형태를 가진 슈퍼클래스의 함수를 재구현 가능
 *  즉, 슈퍼클래스에서 이미 구현이 끝난 함수를 오버라이딩을 통해 재구현
 *  - 사용
 *    - 슈퍼클래스는 재구현이 가능한 함수에 open 키워드를 명시
 *    - 서브클래스는 재구현 시 override 키워드를 명시
 */
internal open class SuperClass(
    var message: String
    ) {
    open fun printMessage(){
        println("[super class] message : $message")
    }
}