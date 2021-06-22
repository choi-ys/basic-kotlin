package ch14.scopeFunction

/**
 * @author : choi-ys
 * @date : 2021/06/18 1:25 오후
 * @apiNote : Kotlin 스코프 함수 : let
 *  - 인스턴스를 생성 후 변수에 담기전 초기화 과정에서
 *    let 함수의 scope 내에서 'it' keyword를 이용하여 인스턴스의 속성과 함수에 접근 가능
 *  - 마지막 구문의 수행 결과를 변수로 반환
 *  - with 구문과의 차이점
 *    - let&run : 인스턴스 접근 시 참조연산자를 사용
 *    - with : 인스턴스 접근 시 참조연산자가 아닌 파라미터 사용
 *  - run 구문과의 차이점 :
 *    - run : scope 내에서 인스턴스의 변수와 함수에 직접 접근
 *    - let : scope 내에서 인스턴스의 변수와 함수를 it keyword를 이용하여 접근
 */
fun main(){
    var name: String = "JPA"
    var price: Int = 20000

    var eventProductPrice:Int = Book(name, price).let {
        it.price -= 2000
        it.price
    }

    println("outer price : $price\n"
            + "instance price : ${eventProductPrice}")
}