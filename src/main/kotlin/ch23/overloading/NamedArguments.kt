package ch23.overloading

/**
 * @author : choi-ys
 * @date : 2021/06/22 5:10 오후
 * @apiNote : Kotlin named arguments
 *  - 파라미터의 순서와 상관없이 파라미터의 이름을 명시하여 값 할당
 */
fun main() {
    /**
     * 파라미터가 있는 경우 -> 입력받은 파라미터를 사용하여 함수 실행
     * 파라미터가 없는 경우 -> 함수 선언 시 파라미터에 지정된 기본값을 사용하여 함수 실행
     */
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("노트북", 30, "학교")

    /**
     * 특정 파라미터의 값을 기본값으로 사용하고 싶은 경우
     * named arguments를 이용하여 파라미터의 순서와 상관없이 파라미터의 이름을 명시하여 값 할당
     */
    deliveryItem("선물", destination = "친구집")
}

/**
 * 파라미터를 받아야 하는 함수이지만, 별다른 파라미터가 없는 경우 기본값을 가지는 함수
 *  - 함수의 파라미터 선언 시, 기본값을 명시
 */
fun deliveryItem(
    name: String,
    count: Int = 1,
    destination: String = "집"
){
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}