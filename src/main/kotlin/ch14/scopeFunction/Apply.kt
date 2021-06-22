package ch14.scopeFunction

/**
 * @author : choi-ys
 * @date : 2021/06/14 6:25 오후
 * @apiNote : Kotlin 스코프 함수 : apply
 *  - 인스턴스를 생성 후 변수에 담기전 초기화 과정에서
 *    apply 함수의 스코프 내에서 참조 연산자 없이 인스턴스의 속성과 함수에 접근 가능
 *  - also 함수와 차이점
 *    - apply :
 *      - scope 내에서 인스턴스의 속성과 함수에 직접 접근
 *      - scope 바깥에 해당 인스턴스와 동일한 변수나 함수가 있는 경우, scope 바깥에 우선순위를 가짐
 *    - also :
 *      - scope 내에서 인스턴스의 속성과 함수 접근 시 'it' keyword를 이용한 접근
 *      - scope 바깥에 해당 인스턴스와 동일한 변수나 함수가 있는 경우에도
 *        'it' keyword를 이용하여 해당 인스턴스의 속성과 함수에 접근
 */
fun main(){
    var name: String = "JPA"
    var price: Int = 20000

    /**
     * apply 함수의 scope에서 인스턴스의 속성과 함수 직접 접근 및 인스턴스 반환
     * 단, apply scope 바깥에 해당 인스턴스와 동일한 이름의 변수나 함수가 있는 경우 scope 바깥에 우선순위를 가짐
     */
    var bookInstanceByApply: Book = Book(name, price).apply {
        name = "[행사]" + name // 해당 인스턴스의 속성에 직접 접근
        price -= 2000 // scope 외부에 해당 인스턴스와 동일한 이름의 변수나 함수가 있는 경우 scope 바깥에 우선순위를 가짐
    }
    println("outer price : $price\n"
             + "instance price : ${bookInstanceByApply.price}\n"
             + "instance name : ${bookInstanceByApply.name}")
}