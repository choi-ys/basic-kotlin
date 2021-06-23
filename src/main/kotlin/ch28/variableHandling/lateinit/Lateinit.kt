package ch28.variableHandling.lateinit

/**
 * @author : choi-ys
 * @date : 2021/06/23 3:04 오후
 * @apiNote : Kotlin 늦은 초기화 : lateinit
 */
fun main() {
    var lateInitExample: LateInitExample = LateInitExample()

    println(lateInitExample.getLateInitText())

    lateInitExample.text = "initialize new value"

    println(lateInitExample.getLateInitText())
}

class LateInitExample{
    lateinit var text: String

    fun getLateInitText(): String{
       if(::text.isInitialized){
           return text
       }else{
           return "not initialized..."
       }
    }
}