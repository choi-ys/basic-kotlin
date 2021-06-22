# Data Class와 Enum Class

## Data Class
```
    데이터를 다루는 데에 최적화된 class
```
## Data Class가 제공하는 5가지 기능
 - equals() : 내용의 동일성을 판단하는 `equals()` 함수 자동구현
 - hashcode() : 객체의 내용에서 고유한 코드를 생성하는 `hashcode()` 함수 자동구현
 - toString() : 포함된 속성을 보기쉽게 나타내는 `toString()` 함수 자동구현
 - componentX() : 속성을 순서대로 반환하는 `componentX()` 함수 자동 구현
 - copy() : 객체를 복사하여 똑같은 내용의 새 객체를 만드는 `copy()` 함수 자동구현
   - `copy()` 함수를 이용하여 새 객체 생성 시 주의 사항
    ```
        // copy() 함수 호출 시 파라미터가 없는 경우 같은 내용의 객체를 생성
        val originInstance = ExampleClass("text", 7)
        val copyInstance = originInstance.copy()
   
        // copy() 함수 호출 시 복사 대상 객체의 생성자와 같은 형태의 파라미터 주입 시 일부 속성을 변경하여 객체를 생성
        val originInstance = ExampleClass("text", 7)
        // copyInstance는 ExampleClass("B", 7)로 생성
        val copyInstance = originInstance.copy("B")
    ```

