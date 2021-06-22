package ch14.scopeFunction

class Book(
    var name: String,
    var price: Int
) {
    fun discountPrice(){
        price -+ 2000
    }
}