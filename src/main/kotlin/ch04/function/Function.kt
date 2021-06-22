package ch04.function

/**
 * @author : choi-ys
 * @date : 2021/06/14 11:29 오전
 * @apiNote : Kotlin 함수 예제
 */
fun main(){
    println(add(1,2,3))
    println(addSingleExpression(1,2,3))
}

/**
 * fun {function name}({...argument name}:return Type){
 *    function action
 * }
 */
fun add(a:Int, b:Int, c:Int):Int{
    return a + b + c
}

/**
 * single expression function
 */
// fun addSingleExpression(a:Int, b:Int, c:Int):Int = a + b + c
fun addSingleExpression(a:Int, b:Int, c:Int) = a + b + c
