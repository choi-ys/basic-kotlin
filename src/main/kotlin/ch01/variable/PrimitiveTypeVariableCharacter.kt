package ch01.variable

/**
 * @author : choi-ys
 * @date : 2021/06/13 6:09 오후
 * @apiNote : Kotlin의 문자형 기본 자료형
 *  - Kotlin은 UTF-16 BE을 사용 = 글자 하나가 2Bytes(16bit)의 메모리 공간을 사용
 */
fun main(){
    var characterVariable: Char = 'a'
    var koreanCharacterVariable: Char = '가'
    var stringVariable: String = "String"
    var multiStringVariable:String ="""여러줄의
        String
        값
    """

    println("characterVariable : " + characterVariable)
    println("koreanCharacterVariable : " + koreanCharacterVariable)
    println("stringVariable : " + stringVariable)
    println("multiStringVariable : " + multiStringVariable)

    var escapeTab: Char = '\t'
    var escapeBackSpace: Char = '\b'
    var escapeNewLine: Char = '\n'
    var escapeSingleQuote: Char = '\''
    var escapeDoubleQuote: Char = '\"'
    var escapeBackSlash:Char = '\\'

    println("escapeNewLine : " + escapeNewLine)
    println("escapeTab : " + escapeTab)
    println("escapeBackSpace : " + escapeBackSpace)
    println("escapeSingleQuote : " + escapeSingleQuote)
    println("escapeDoubleQuote : " + escapeDoubleQuote)
    println("escapeBackSlash : " + escapeBackSlash)
}
