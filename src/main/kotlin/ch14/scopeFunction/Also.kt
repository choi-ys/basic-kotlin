package ch14.scopeFunction

/**
 * @author : choi-ys
 * @date : 2021/06/18 1:25 오후
 * @apiNote : Kotlin 스코프 함수 : also
 *  - 인스턴스를 생성한 후 변수에 담기전 초기화 과정을 수행할 때
 *    also 함수의 scope 내에서 'it' keyword를 이용하여 인스턴스의 속성과 함수에 접근 가능
 *    apply 함수와 동일한 기능을 수행하지만 인스턴스와 같은 이름의 변수나 함수가 socpe 바깥에 중복되어 있는 경우
 *    혼선을 방지하기 위해 it를 통해 인스턴스에 접근
 *  - apply 함수와 차이점
 *    - apply :
 *      - scope 내에서 인스턴스의 속성과 함수 직접 접근
 *      - scope 바깥에 해당 인스턴스와 동일한 변수나 함수가 있는 경우, scope 바깥에 우선순위를 가짐
 *    - also :
 *      - scope 내에서 인스턴스의 속성과 함수 접근 시 'it' keyword를 이용한 접근
 *      - scope 바깥에 해당 인스턴스와 동일한 변수나 함수가 있는 경우에도
 *        'it' keyword를 이용하여 해당 인스턴스의 속성과 함수에 접근
 */
fun main(){
    var name: String = "JPA"
    var price: Int = 20000

    var bookInstanceByAlso: Book = Book(name, price).also {
        it.name = "[행사]" + name // 해당 인스턴스의 속성에 직접 접근
        it.price -= 2000 // scope 외부에 해당 인스턴스와 동일한 이름의 변수나 함수가 있는 경우 scope 바깥에 우선순위를 가짐
    }

    println("outer price : $price\n"
            + "instance price : ${bookInstanceByAlso.price}\n"
            + "instance name : ${bookInstanceByAlso.name}")
}