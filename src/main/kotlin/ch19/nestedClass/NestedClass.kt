package ch19.nestedClass

/**
 * @author : choi-ys
 * @date : 2021/06/22 3:19 오후
 * @apiNote :
 */
fun main() {
    OuterClass.NestedClass().introduce()

    println()

    var outerClassInstance: OuterClass = OuterClass()
    outerClassInstance.InnerClass().introduce()
    outerClassInstance.InnerClass().introduceOuter()

    println()
    outerClassInstance.text = "Changed Outer Class"
    outerClassInstance.InnerClass().introduceOuter()
}

class OuterClass{
    var text = "Outer Class"

    class NestedClass{
        fun introduce(){
            println("Nested Class")
        }
    }

    inner class InnerClass{
        var text = "Inner Class"

        fun introduce(){
            println(text)
        }

        fun introduceOuter(){
            println(this@OuterClass.text)
        }
    }
}