package ch17.polymorphism

/**
 * @author : choi-ys
 * @date : 2021/06/18 5:58 오후
 * @apiNote : Ktolin : 다형성
 *  - 클래스의 상속관계에서 오는 인스턴스의 호환성을 적극 활용할 수 있는 기능으로,
 *    슈퍼클래스가 같은 인스턴스를 한번에 관리하거나, 인터페이스를 구현하여 사용하는 코드에서도 사용
 */
fun main() {
    var a = Drink()
    a.drink()

    // up-casting 상위 자료형인 슈퍼클래스로 변환
    var b: Drink =  Cola()
    b.drink()

    // is를 이용한 down-casting : is 연산자를 이용한 타입체크와 동시에 다운 캐스팅
    if(b is Cola){
        b.washDishes()
    }

    // as를 이용한 down-casting : as 연산자를 이용한 변환 대상도 동시에 다운 캐스팅
    var c = b as Cola
    c.washDishes()
    b.washDishes() // as를 이용한 타입 캐스팅 시 변환 대상인 b도 동시에 다운 캐스팅
}

open class Drink(){
    var name = "음료"
    open fun drink(){
        println("${name}를 마십니다.")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다.")
    }

    fun washDishes(){
        println("${type}로 설거지를 합니다.")
    }
}