# Kotlin : 자료구조 List

## List : 
 - 데이터를 모아 관리하는 Collection Class를 상속받는 SubClass 중 하나 
 - 여러개의 데이터를 코드에서 지정한 원하는 순서로 넣어 관리하는 자료구조

### 종류
 - List<out T> : List객체 생성 시 할당한 객체를 대체, 추가, 삭제 할 수 없음
 - MutableList<T> : MutableList객체 생성 시 할당한 객체를 대체, 추가, 삭제 가능

### 사용
 - 데이터 추가
   - List : listOf(data)
   - MutableList : 
     - 선언과 동시에 초기화 : mutableListOf(data)
     - 추가
       - add(data)
       - add(index, data)
     - 삭제
       - remove(data)
       - removeAt(index)
     - 무작위 섞기
       - shuffle()
     - 정렬
      - sort()
     