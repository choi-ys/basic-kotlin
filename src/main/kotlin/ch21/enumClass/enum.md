# Enum (열거형 타입)
```
    서로 연관되거나 관련이 있는 상수들의 집합
    상태를 구분하기 위한 객체들을 선언 후, 하나의 상태를 선택하여 나타내기 위한 클래스
```

## 장점
 - 코드가 간략해지며 가독성이 높아짐
 - 인스턴스 생성과 함께 상속을 방지하여 타입 안정성을 보장
 - `enum` 키워드를 명시하여 구현하므로 의도 전달이 명확 

## 주의사항
```
    Enum Class에 선언된 객체들은 관례상 상수를 나타낼 떄 사용하는 대문자로 표기
```

## 사용
```
    // 상태만 열거
    enum class Color() {
        RED,
        BLUE,
        GREEN
    } 
    
    // 상태 열거시 고유한 속성을 부여
    enum class Color(val number: Int) {
        RED(1),
        BLUE(2),
        GREEN(3)
    }
    
    // enum class 내부에 함수 구현 (마지막 열거 타입 뒤에 ';'을 명시한 후 함수 구현
    enum class Color(val number: Int) {
        RED(1),
        BLUE(2),
        GREEN(3);
        
        fun isRed() = this == Color.RED
    }
```