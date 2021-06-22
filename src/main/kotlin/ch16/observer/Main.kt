package ch16.observer

/**
 * @author : choi-ys
 * @date : 2021/06/18 5:36 오후
 * @apiNote : Observer pattern 구현부 호출
 */
fun main() {
    EventPrinter().start()
    println()
    EventPrinterByAnonymousObject().start()
}