package ch19.dataStructure.list

/**
 * @author : choi-ys
 * @date : 2021/06/21 9:46 오후
 * @apiNote : Kotlin의 Collection : List
 */
fun main(){
    val fruitList: List<String> = listOf("사과", "딸기", "배")
    println(fruitList[1])

    for (fruit in fruitList){
        print("$fruit:")
    }

    println()

    val numberMutableList: MutableList<Int> = mutableListOf(6, 3, 1)
    println(numberMutableList)

    numberMutableList.add(4)
    println(numberMutableList)

    numberMutableList.add(2, 8)
    println(numberMutableList)

    numberMutableList.removeAt(1)
    println(numberMutableList)

    numberMutableList.shuffle()
    println(numberMutableList)

    numberMutableList.sort()
    print(numberMutableList)
}
