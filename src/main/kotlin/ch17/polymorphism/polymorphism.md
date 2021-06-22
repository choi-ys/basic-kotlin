# Kotlin : polymorphism (다형성)

## up-casting
```
    var subClassInstance: SuperClass = SubClass()
```
## down-casting (캐스팅 연산자인 as 혹은 is 를 이용)
```
    var subClassInstance: SuperClass = SubClass()
    // #1
    if(subClassInstance is SubClass){
        // context
    }
    
    // #2
    var newSubClassInstance = subClassInstance as SubClass
```

## as : 
 - 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자
```
    var subClassInstance: SuperClass = SubClass()
    /**
    * 캐스팅 연산자인 as를 이용하여 형변환 : subClassInstance는 SubClass로 동작
    * as를 이용한 형변환 시 변환한 결과를 반환 받아 변수에 할당 가능
    */
    var variable = subClassInstance as SubClass() // 
```

## is : 
 - 변수가 자료형에 호환되는지 체크한 후 변환해주는 캐스팅 연산자
 - 반드시 조건만 안에서만 수행
```
    var subClassInstance: SuperClass = SubClass()
    if(subClassInstance is SubClass){
        
    }
```