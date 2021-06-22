package ch11.overriding

/**
 * @author : choi-ys
 * @date : 2021/06/14 4:20 오후
 * @apiNote :
 */
internal class SubClass(message: String) : SuperClass(message){
    override fun printMessage(){
        println("[sub class] message : $message")
    }
}