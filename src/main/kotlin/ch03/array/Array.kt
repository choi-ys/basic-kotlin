package ch03.array

/**
 * @author : choi-ys
 * @date : 2021/06/14 10:53 오전
 * @apiNote : 배열
 *  - 내부적으로 Array 클래스를 통해 제공되는 기능
 *  - 단점 : 배열의 선언 시 할당된 배열의 크기를 변경할 수 없음
 *  - 장점 : 다른 자료구조보다 입출력이 빠름
 *  - 배열의 선언
 *    - 배열의 크기를 명시한 배열의 선언
 *      - EX) var intArr = arrayOf(1, 2, 3, 4, 5)
 *    - 선언과 동시에 초기화
 *      - EX) var intArr = arrayOfNulls<Int>(5)
 *  - 배열의 값 할당
 *    - intArr[0] = 1
 *  - 배열의 값 접근
 *    - println(intArr[0])
 */
fun main(){
    /**
     * 선언과 동시에 초기화 된 배열
     */

//    var initIntArray:Array<Int> = arrayOf(1, 2, 3)
    var initIntArray = arrayOf(1, 2, 3)
    for (i in initIntArray) {
        println(i)
    }

    /**
     * 크기를 지정한 배열의 선언
     */
    var intArray = arrayOfNulls<Int>(3)

    /**
     * 배열의 값 할당
     */
    intArray[0] = 1
    intArray[1] = 2
    intArray[2] = 3

    /**
     * 배열의 값 접근
     */
    println(intArray[0])
    println(intArray[1])
    println(intArray[2])
}