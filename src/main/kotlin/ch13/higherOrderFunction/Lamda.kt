package ch13.higherOrderFunction

/**
 * @author : choi-ys
 * @date : 2021/06/14 6:25 오후
 * @apiNote : Kotlin 람다 함수
 *  - 람다함수도 일반 함수처럼 여러구문의 사용이 가능
 *  - 람다함수가 여러구문인 경우 마지막 구문의 결과값을 반환
 *  - 파라미터가 없는 람다함수는 실행할 구문만 나열하면 됨
 *  - 파라미터가 하나뿐이라면 it 키워드로 대체하여 사용
 */
fun main(){
    higherOrderFunction(::normalFunction)

    var lambdaExpression: (String) -> Unit = {
            message -> println("$message : 람다함수의 호출")
    }
    higherOrderFunction(lambdaExpression)

    var lambdaExpressionContraction = {
            message: String -> println("$message : 축약 람다함수의 호출")
    }
    higherOrderFunction(lambdaExpressionContraction)

    /**
     * 여러 구문을 가지는 람다 함수 호출
     */
    var multiPhaserLambda: () -> Unit = {
        println("여러 구문을")
        println("실행할 수 있습니다.")
    }
    functionCaller(multiPhaserLambda)

    /**
     * 여러 구문을 가지는 람다 함수의 마지막 구문의 결과값을 반환
     */
    var plus: (Int, Int) -> Int = { x, y ->
        println("input x = $x")
        println("input y = $y")
        print("x + y = ")
        x+y
    }
    println(plus(1,2))
}
fun normalFunction(parameter: String){
    println("$parameter : 일반함수의 호출")
}

fun higherOrderFunction(paramFunction: (String) -> Unit){
    paramFunction("Call function")
}

fun functionCaller(paramFunction: () -> Unit){
    paramFunction()
}