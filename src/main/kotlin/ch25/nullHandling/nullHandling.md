# Kotlin의 null을 다루는 방법

## nullable 변수의 선언
 - '?'연산자를 이용한 nullable 변수의 선언
```
    var nullableString: String? = null
```
---
## nullable 객체에 접근시 주의 사항
```
    nullable한 객체의 속성이나 함수에 접근 시 Null Pointer Exception(null인 객체 참조시 발생하는 예외) 발생 가능
    따라서, nullable 변수 사용 시 null check 구문 없이는 코드 컴파일 불가능
    Kotlin은 이런 nullable 변수의 null check를 일일히 if문으로 체크하는 대신 nullable객체를 다루는 연산자 제공
```
---
## nullable 객체를 다루는 연산자
 - ?. : null safe operator
   - 참조 연산자를 실행하기 전에 객체의 null 여부를 확인하며, 객체가 null인 경우 1이후 구문은 수행하지 않음
    ```
        var sample: String? = null
   
        // '?.'연산자를 이용하여 null인 변수에 접근하므로 참조연산자 이후 구문인 toUpperCase() 함수는 수행되지 않음
        sample?.toUpperCase()
    ```
 - ?: : elvis operator
   - 객체가 null이 아니라면 그대로 사용, 객체가 null인 경우 우측에 위치한 객체로 대체
    ```
        var sample: String? = null

        // '?:'연산자를 이용하여 null인 변수에 접근하므로 '?:'연산자 우측에 선언된 객체로 대체 
        sample?:"default"
    ```
 - !!. : non-null assertion operator
  - 참조 연산자를 사용할 때 null여부를 컴파일시 확인하지 않도록 하여, 런타임시 Null Pointer Exception이 나도록 의도적으로 방치하는 연산자
    ```
        var sample: String? = null
        
        // '!!.'연산자를 이용하여 null인 객체에 접근 시 NPE가 발생하도록 의도 하였으므로, toUpperCase()구문 수행시 NPE 발생
        sample!!.toUpperCase()
    ```
