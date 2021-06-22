package ch09.`class`

import java.time.LocalDate

/**
 * @author : choi-ys
 * @date : 2021/06/14 2:50 오후
 * @apiNote : Kotlin 클래스의 속성과 함수 선언
 *  - 객체를 표현하는 값과 그 값을 사용하는 기능의 모임
 *    - 속성 : 고유의 특징값
 *    - 함수 : 기능의 구현
 */
fun main(){
    var member: User = User("최용석", LocalDate.of(1991, 6, 2))
    var manager: User = User("최현옥", LocalDate.of(1992, 9, 12))

    println("member -> ${member.name}, ${member.birthday}")
    println("manager -> ${manager.name}, ${manager.birthday}")

    member.updateName("최 용석")
    println("member -> ${member.name}, ${member.birthday}")
}

class User (
    /**
     * Class의 속성과 생성자를 동시에 선언
     */
    var name: String,
    var birthday: LocalDate
    ){
    fun updateName(newName:String){
        name = newName
    }
}