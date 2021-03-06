# 중첩 클래스와 내부 클래스
```
하나의 클래스가 다른 클래스의 기능과 강하게 연관되어 있다는 의미를 전달하기 위해 만들어진 형식
```

## 중첩클래스와 내부클래스의 차이점
- 중첩클래스 : 형태만 내부에 존재하며, 외부 클래스의 내용을 공유할 수 없는 별개의 클래스
- 내부클래스 : 반드시 외부 클래스 객체 안에서 사용되며, 외부 클래스의 속성과 함수의 사용이 가능

## 장점
```
클래스간의 연계성 표현하여 코드의 가독성 및 작성 편의성이 올라갈 수 있으므로 적절한 상황에서 사용을 권장
```
---

## 중첩 크래스
### 사용
```
    // 선언
    class OuterClass {
        class NestedClass {
        
        }
    }
    
    // 접근
    OuterClass.NestedClass()
```
---

## 내부 클래스
### 사용
```
    // 선언
    class OuterClass {
        inner class InnerClass {
        
        }
    }
```
---

## 주의사항
 - 내부클래스 단독으로 객체 생성 불가
 - 외부클래스의 객체가 있어야만 생성과 사용이 가능