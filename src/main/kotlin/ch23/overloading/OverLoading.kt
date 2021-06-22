package ch23.overloading

/**
 * @author : choi-ys
 * @date : 2021/06/22 4:55 오후
 * @apiNote : Kotlin overloading
 *  - 같은 Scope안에서 같은 이름의 함수를 여러번 선언할 수 있는 기능
 *  - 파라미터의 개수가 다르거나 파라미터의 자료형이 다른 경우 서로 다른 함수로 동작
 *  - 단, 파라미터의 자료형과 갯수가 동일하고 파라미터 명만 다른 경우 오버로딩 불가
 */
fun main(){
    /**
     * 함수 이름은 같지만, 자료형을 구분하여 함수가 매칭되어 실행
     */
    read(7)
    read("감사합니다.")
}

fun read(x: Int){
    println("숫자 $x 입니다.")
}

fun read(x: String){
    println(x)
}