# Kotlin : generic

## 슈퍼클래스인 A와 이를 상속받은 서브클래스 B를 모두 인자로 하는 함수의 파라미터 선언
```
    // 슈퍼클래스인 A와 이를 상속받은 서브클래스를 인자로 취할 수 있는 함수의 파라미터 선언
    fun someFunction(var superClassInstance: SuperClass){ }
```
 - 문제점 : 타입 캐스팅 시 프로그래밍 속도를 저하시킬 수 있는 단점이 있음
 - 해결 : 이를 해결하기 위해 함수나 클래스를 선언할 때 고정적인 자료형 대신 실제 자료형으로 대체 되는 타입 파라미터를 받아 사용하는 방법
```
    // 다음과 같이 실제 자료형으로 대체 되는 Generic 타입으로 파라미터를 선언하면
    fun <T> genericFunc(param: T): T
    class GenericClass <T> (var pref: T)
    
    // 타입 파라미터인 T에 특정 자료형이 할당되면
    fun <Int> genericFunc(param: T): T
    class GenericClass <Int> (var pref: T)
    
    // 컴파일 시점에 generic을 사용하는 모든 파라미터는 할당된 자료형으로 대체되어 컴파일됨
    fun <Int> genericFunc(param: Int): Int
    class GenericClass <Int> (var pref: Int)  
```
 - 결론 : 즉 컴파일 시점에 할당된 자료형으로 대체되므로, 타입캐스팅 연산이 일어나지 않아 부하를 방지 한다.
 - 선언 : 
    - 클래스 이름과 규칙이 같음 
    - 관례상 Type의 이니셜인 'T'를 사용
    - 여러개의 generic을 사용하는 경우 'T'다음 알파벳인 'U','V'를 사용 : <T, U, V>
    - 특정한 슈퍼 클래스를 상속받은 클래스 타입으로만 제한하는 경우 슈퍼 클래스를 명시 : <T: SuperClass>
 - 사용 : 
```
    // 선언
    fun<T> genericFunc(var parma:T){}
    
    // 사용
    genericFunc(1)
    
    // 파라미터나 반환형을 통해 컴파일시점에 타입 파라미터의 자료형을 추론
    fun<Int> genericFunc(var parma:Int){}
```
    
