package ch20.dataClass

/**
 * @author : choi-ys
 * @date : 2021/06/22 4:12 오후
 * @apiNote :
 */
fun main() {
    var general: General = General("최용석", 31)

    // general 인스턴스와 똑같이 만든 객체와 내용이 동일한지 비교
    println(general == General("최용석", 31))
    println(general.hashCode())
    println(general)

    println()

    var data: Data = Data("박재현", 29)

    // data 인스턴스와 똑같이 만든 객체와 내용이 동일한지 비교
    println(data == Data("박재현", 29))
    println(data.hashCode())
    println(data)

    println()
    println("data.copy() : " + data.copy())
    println("data.copy(\"재현\") : " + data.copy("재현"))
    println("data.copy(age = 30) : " + data.copy(age = 30))
}

class General(
    val name: String,
    val age: Int
)

data class Data(
    val name: String,
    val age: Int
)