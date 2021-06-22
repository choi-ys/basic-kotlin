package ch14.scopeFunction

/**
 * @author : choi-ys
 * @date : 2021/06/18 1:25 오후
 * @apiNote : Kotlin 스코프 함수 : with
 *  - 인스턴스를 생성 후 변수에 담기전 초기화 과정에서
 *    with 함수의 scope 내에서 참조 연산자 없이 직접 인스턴스의 속성과 함수에 접근 가능
 *  - 마지막 구문의 수행 결과를 변수로 반환
 *  - run 구문과의 차이점
 *    - run : 인스턴스 접근 시 참조연산자를 사용
 *    - with : 인스턴스 접근 시 참조연산자가 아닌 파라미터 사용
 *      - scope 바깥에 해당 인스턴스와 동일한 변수나 함수가 있는 경우, scope 바깥에 우선순위를 가짐
 *  - let 구문과의 차이점 :
 *    - with : scope 내에서 인스턴스의 변수와 함수에 직접 접근
 *    - let : scope 내에서 인스턴스의 변수와 함수를 it keyword를 이용하여 접근
 */
fun main(){
    var name: String = "JPA"
    var price: Int = 20000

    var eventProductPrice: Int = with(Book(name, price)) {
        price -=2000 // scope 외부에 해당 인스턴스와 동일한 이름의 변수나 함수가 있는 경우 scope 바깥에 우선순위를 가짐
        this.price -= 2000 // scope 내부 인스턴스에 접근할 경우 'this' keyword를 이용하여 접근
        println("outer price : $price\n"
                + "inner price : ${this.price}")

        this.price // 마지막 구문의 수행결과를 반환
    }

    println("outer price : $price\n"
            + "result price : ${eventProductPrice}")
}