package ch15.`object`

/**
 * @author : choi-ys
 * @date : 2021/06/18 5:01 오후
 * @apiNote : Kotlin companion object
 *  - Class 내부에 선언되어 해당 Class를 통해 생성된 instance의 공유 가능한 Object
 */
fun main() {
    var firstFood: FoodPool = FoodPool("짜장면")
    var secondFood: FoodPool = FoodPool("짬뽕")

    firstFood.vote()
    firstFood.vote()
    secondFood.vote()
    secondFood.vote()
    secondFood.vote()

    println("firstFood vote result : " + firstFood.count)
    println("secondFood vote result : " + secondFood.count)
    println("total vote result : " + FoodPool.total)
}

class FoodPool(
    val name: String
    ){
    companion object{
        var total = 0
    }
    var count = 0

    fun vote(){
        total++
        count++
    }
}