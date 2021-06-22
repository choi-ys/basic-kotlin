# Kotlin : 자료구조 Set

## Set :
- 순서가 정렬되지 않으며, 중복이 허용되지 않는 컬렉션
- 인덱스로 위치를 지정한 객체 참조 불가능
- contains() 함수를 이용해 객체가 Set에 존재하는지 여부만 판별 가능

## 종류
- Set<out T> : Set객체 생성 시 할당한 객체를 대체, 추가, 삭제 할 수 없음
- MutableSet<T> : MutableSet객체 생성 시 할당한 객체를 대체, 추가, 삭제 가능

### 사용
- MutableSet
    - 추가
        - add(data)
    - 삭제
        - remove(data)
    
