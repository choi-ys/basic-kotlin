package ch11.overriding

/**
 * @author : choi-ys
 * @date : 2021/06/14 4:34 오후
 * @apiNote :
 */
fun main(){
    var superClass: SuperClass = SuperClass("슈퍼클래스")
    superClass.printMessage()

    var subClass: SubClass = SubClass("서브클래스")
    subClass.printMessage()
}