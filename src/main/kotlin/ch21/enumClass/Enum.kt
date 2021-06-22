package ch21.enumClass

/**
 * @author : choi-ys
 * @date : 2021/06/22 4:31 오후
 * @apiNote :
 */
fun main() {
    var state = State.SING
    // enum 변수를 그대로 출력할 경우 toString()을 통해 상태 객체의 이름이 출력
    println(state)

    state = State.SLEEP
    // 같은 객체끼리 비교 하였으므로 true를 반환
    println(state.isSleeping())

    state = State.EAT
    // State.EAT 객체의 속성을 출력
    println(state.message)
}

enum class State(val message: String){
    SING("노래를 부릅니다."),
    EAT("밥을 먹습니다."),
    SLEEP("잠을 잡니다.");

    fun isSleeping() = this == State.SLEEP
}