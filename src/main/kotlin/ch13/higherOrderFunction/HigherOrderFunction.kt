package ch13.higherOrderFunction

/**
 * @author : choi-ys
 * @date : 2021/06/14 5:49 오후
 * @apiNote : 고차함수 = 함수를 인스턴스처럼 다루기 위한 기술
 *  - 함수를 파라미터로 넘기거나, 결과값으로 반환받을 수 있다.
 *  - 문법
 *    - fun 함수명(파라미터명: (파라미터가 되는 함수의 파라미터) -> 파라미터가 되는 함수의 리턴 타입) : 함수의 리턴타입 {}
 *  - 사용
 *    - 함수를 파라미터로 가지는 함수(::파라미터가 되는 함수)
 *    - :: = 일반함수를 고차함수로 변경해 주는 연산자
 */
fun main() {
    var returnValue:String = functionAsCaller(::functionAsParameter)
    println(returnValue)
}

fun functionAsParameter(message: String) : String{
    return "[function As a Parameter] : $message"
}

/**
 * 고차함수 형식의 파라미터를 가지는 함수
 *  - 문법
 *  fun function name(parameter name : (parameters of being called function, ..) -> { return type of being called function } ){}
 *  Unit : 파라미터로 사용되는 함수의 반환형이 void인 경우
 */
fun functionAsCaller(beingCalledFunction: (String) -> String) : String{
    return beingCalledFunction("[function As a Caller]")
}