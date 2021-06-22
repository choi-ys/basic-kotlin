package ch20.dataClass

/**
 * @author : choi-ys
 * @date : 2021/06/22 4:21 오후
 * @apiNote :
 */
fun main(){
    val list = listOf(
        Data("이성욱", 31),
        Data("전성원", 27),
        Data("이하은", 29)
    )

    /**
     * data class 생성시 자동으로 구현된 componentX 함수를 이용하여 내부적으로 list에 할당된 각 객체의 파라미터에 접근
     * a = component1()라는 함수를 이용하여 Data()객체의 첫번째 파라미터에 접근
     * b = component2()라는 함수를 이용하여 Data()객체의 두번째 파라미터에 접근
     */
    for ((a, b) in list){
        println("${a}, ${b}")
    }
}