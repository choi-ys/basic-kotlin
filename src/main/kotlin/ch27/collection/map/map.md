# Kotlin : 자료구조 Map

## Set : 
 - 객체를 저장할때 객체를 찾을 수 있도록 key, value를 쌍으로 이루는 컬렉션
   - key : 객체를 찾기 위한 값
   - value : key와 연결된 객체
 - 내부적으로 MutableMap.mutableEntry 객체로 구성
   - Entry객체로 구성된 특성으로 인해 index가 아닌 key를 통해 객체를 탐색하는 특징을 가짐
 - 이미 존재하는 key에 새로운 객체 할당 시, 기존 객체가 새로운 객체로 대체됨
 - key와 value를 to로 연결
   - EX) val mutableMap: MutableMap<String, String> = mutableMapOf("key" to "value") 

## 종류
 - Mpa<K, out V> : Set객체 생성 시 할당한 객체를 대체, 추가, 삭제 할 수 없음 
 - MutableSet<K, V> : MutableSet객체 생성 시 할당한 객체를 대체, 추가, 삭제 가능

### 사용
 - MutableMap
   - 추가
     - put(key, value)
   - 삭제
     - remove(key)
    
