#Kotlin의 Scope 함수
## 개념 : 람다함수를 이용하여 함수형 언어의 특징을 좀더 편리하게 사용 할 수 있도록 Kotlin에서 기본 제공하는 함수

## 용도 : 클래스에서 생성한 인스턴스를 스코프 함수에 전달하여 인스턴스의 속성이나 함수를 스코프 함수 내에서 편리하게 사용할 수 있음

### 종류
 - apply : 인스턴스 생성 후 변수에 담기 전 초기화 과정에서 apply scope 내에서 직접 인스턴스의 속성과 함수를 참조 연산자 없이 사용 가능, 처리가 끝나면 인스턴스를 반환
```
    var instance = Class(Parmas).run {
        access instance without reference operator
    }
```

---
- also : apply와 동일한 기능을 수행, 처리가 끝나면 인스턴스를 반환은 동일하지만 참조연산자를 통해 인스턴스에 접근하는 것이 아닌 파라미터로 인스턴스를 넘긴것처럼 it를 통해서 인스턴스에 접근 가능
  - 파라미터를 통해서 인스턴스에 접근하는 이유 : 같은 이름의 변수나 함수가 scope 바깥에 중복되어 있는 경우 혼선을 방지 하기 위함
```
    var instance = Class(Parmas).also {
        access instance to it keyword
    }
```

---
 - run : apply와 같이 socpe 내에서 인스턴스의 속성과 함수를 참조연산자 없이 직접 사용 가능, 람다함수와 같이 마지막 구문을 반환
```
    var returnValue = Class(Parmas).run {
        last context is return value 
    }
```

---
 - let : run, with과 동일한 기능을 수행하며 마지막 구문의 수행 결과를 반환은 동일하지만, 참조연산자를 통해 인스턴스에 접근하는 것이 아닌 파라미터로 인스턴스를 넘긴것처럼 'it'를 통해서 인스턴스에 접근 가능
   - 파라미터를 통해서 인스턴스에 접근하는 이유 : 같은 이름의 변수나 함수가 scope 바깥에 중복되어 있는 경우 혼선을 방지 하기 위함

```
    var returnValue = Class(Parmas).let {
        access instance to it keyword
        last context is return value 
    }
```

---
 - with : run 함수와 동일한 기능을 수행하지만 인스턴스 접근시 참조 연산자 대신 파라미터로 받는 차이점이 있음
```
    var returnValue = with(Class(Parmas)) {
        last context is return value
    }
```

