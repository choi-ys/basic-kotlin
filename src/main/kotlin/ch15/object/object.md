# Ktolin : Object
## 개념 : 생성자 없이 객체를 직접 생성하는 Object

## Class와의 차이점
 - Class는 인스턴스를 생성하는 틀이기 때문에, 클래스 내부에 기술한 속성이나 함수를 사용하려면 생성자를 통해 인스턴스를 생성 후, 생성된 인스턴스의 속성이나 함수에 접근 
 - 여러개의 인스턴스의 생성 없이 단 하나의 객체만으로 공통적인 속성과 함수를 사용해야 하는 경우 Object를 사용
   - Singleton Pattern을 언어차원에서 지원

## 종류 : 
 - Application 전역에서 공용으로 사용하는 object
 - Class 내부에 선언되어 instance간 공용으로 사용하는 companion object

## 활용 : 
 - '최초 사용시' 자동으로 생성
 - Application 전역에서 공용으로 사용 가능
 - 프로그램이 종료되기 전까지 공통적으로 사용할 내용을 기술

## 문법
```
    object object_name{
        var variable_name
        
        fun function_name(){
            function context
        }
    }
```