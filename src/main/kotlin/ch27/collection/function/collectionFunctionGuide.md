# Kotlin : Collection function
```
    람다 함수를 이용하여 컬렉션을 좀 더 편리하게 조작할 수 있는 함수로, 경우에 따라 반복문과 조건문 대신 사용하면
```

## forEach {}
 - 컬렉션에 포함된 모든 객체를 순회하면서 'it'라는 키워드로 참조
    ```
        var numberList: List<Int> = listOf(1, 2, 3, 4)

        numberList.forEach{
            println(it)
        }
    ```
---

## filter {}
 - 컬렉션에 포함된 모든 객체를 순회하면서 조건에 부합하는 객체를 별도의 컬렉션으로 반환
    ```
        var numberList: List<Int> = listOf(1, 2, 3, 4)

        val filteredList = numberList.filter {
            it < 3
        }
   
        filteredList.forEach{
            println(it)
        }    
    ```
---
## map {}
 - 컬렉션에 포함된 모든 객체를 순회하면서 각 객체에 수식을 적용 후 별도의 컬렉션으로 반환
    ```
        var numberList: List<Int> = listOf(1, 2, 3, 4)

        var mappedList = numberList.map {
            it * 2
        }
   
        mappedList.forEach {
            println(it)
        }  
    ```
---
## any, all, none
 - 컬렉션에 포함된 각 객체를 접근 하는 it 키워드에 조건을 부여하여 부합하는지 여부를 판별
   - `any` : 컬렉션에 포함된 객체중 조건에 부합하는 객체가 하나라도 있는 경우 true 반환
   - `all` : 컬렉션에 포함된 모든 객체가 조건에 부합하는 경우 true 반환
   - `none` : 컬렉션에 포함된 모든 객체가 조건에 부합하지 않는 경우 true 반환

---
## first, find, firstOrNull
 - `first()` : 컬렉션의 첫번째 아이템을 반환
 - `first {}` : 조건에 부합하는 첫번째 아이템을 반환
 - `find {}` : 조건에 부합하는 첫번째 아이템을 반환 (first {}와 같은 기능을 수행)
 

## last, findLast, lastOrNull
 - `last()` : 컬렉션의 마지막 아이템을 반환
 - `last {}` : 조건에 부합하는 마지막 아이템을 반환
 - `findLast {}` : 조건에 부합하는 마지막 아이템 아이템을 반환 (last {}와 같은 기능을 수행)

```
    - 주의사항 : 해당 함수가 적용되는 컬렉션에 조건에 부합하는 객체가 없거나 컬렉션이 비어있는 경우 NoSuchElementException 발생
    - null safe하게 객체를 핸들링 하기 위해 아래와 같은 함수를 사용
      - firstOrNull, lastOrNull : 객체가 null인 경우 null을 반환
```
---

## count
 - `count()` : 컬렉션의 모든 아이템의 개수를 반환
 - `count {}` : 컬렉션 내 조건에 부합하는 아이템의 개수를 반환
---