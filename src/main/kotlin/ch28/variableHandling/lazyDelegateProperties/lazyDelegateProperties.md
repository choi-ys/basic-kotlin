# Kotlin의 지연대리자 속성 : lazy delegate properties

## lazy delegate properties
 - 변수 선언 시 값을 초기화 하지 않고 명시하여, 해당 변수가 최초로 사용될때 명시한 값으로 초기화하므로 코드의 실행시간을 최적화
 - 람다함수로 초기화가 진행되므로 여러 구문을 작성할 수 있으며, 마지막 구문의 결과가 변수에 할당
 - 초기값을 명시한다는 점에서 `lateinit`과 차이점이 있음
---