# Kotlin : Collection function
```
    람다 함수를 이용하여 컬렉션을 좀 더 편리하게 조작할 수 있는 함수로, 경우에 따라 반복문과 조건문 대신 사용하면
```
---

## associateBy {}
 - 아이템에서 key를 추출하여 map으로 변환하여 반환
---

## groupBy {}
 - key가 같은 아이템 끼리 배열로 묶어 map으로 만드는 함수
---

## partition {}
 - 컬렉션에 포함된 아이템에 조건을 걸어 두개의 컬렉션으로 나누어 반환, 반환 시 나누어진 두개의 컬렉션을 포함한 Pair Class로 반환
  - 나누어진 두개의 컬렉션은 first, second로 접근
---