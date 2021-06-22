package ch26.checkObjectEquals

/**
 * @author : choi-ys
 * @date : 2021/06/22 6:08 오후
 * @apiNote : Kotlin 객체의 동일성 비교
 */
fun main() {
    var a: Product = Product("콜라", 1000)
    var b: Product = Product("콜라", 1000)
    var c = a
    var d: Product = Product("사이다", 1000)

    /**
     * a와 b는 내용은 동일하지만, 객체는 동일하지 않음
     */
    println(a == b)
    println(a === b)

    /**
     * a와 c는 내용과 객체 모두 동일
     */
    println(a == c)
    println(a === c)

    /**
     * a와 d는 내용과 객체 모두 동일하지 않음
     */
    println(a == d)
    println(a === d)
}

class Product(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return other.name == name && other.price == price
        }else{
            return false
        }
    }
}