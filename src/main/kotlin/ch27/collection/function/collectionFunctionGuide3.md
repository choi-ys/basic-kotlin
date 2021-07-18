# Kotlin : Collection function
```
    람다 함수를 이용하여 컬렉션을 좀 더 편리하게 조작할 수 있는 함수로, 경우에 따라 반복문과 조건문 대신 사용하면
```
---

## flatMap {}
 - 아이템마다 만들어진 켈렉션을 합쳐서 반환
---

## getOrElse () {}
 - 인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본값을 반환하는 함수
---

### zip
 - 컬렉션 두개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어 줌
 - 이때 결과 리스트의 아이템 개수는 더 작은 수의 List를 기준으로 생성
---