package ch18.generic

/**
 * @author : choi-ys
 * @date : 2021/06/19 11:21 오후
 * @apiNote :
 */
fun main(){
    UsingGeneric(SuperClass()).doPrint()
    UsingGeneric(SubClassA()).doPrint()
    UsingGeneric(SubClassB()).doPrint()

    doPrint(SubClassA())
}

open class SuperClass {
    open fun printMessage(){
        println("SuperClass의 function")
    }
}

open class SubClassA : SuperClass() {
    override fun printMessage() {
        println("SubClassA의 function")
    }
}

open class SubClassB : SuperClass() {
    override fun printMessage() {
        println("SubClassB의 function")
    }
}

/**
 * Generic한 파라미터를 받기 위해 타입 파라미터 선언시
 * 특정 클래스를 명시 하여 특정한 슈퍼클래스를 상속받은 클래스 타입으로 제한
 * <T: SuperClass>
 */
class UsingGeneric<T: SuperClass>(var t: T){
    fun doPrint(){
        t.printMessage()
    }
}

fun <T: SuperClass> doPrint(t:T){
    t.printMessage()
}