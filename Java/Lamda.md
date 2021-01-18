# 람다와 스트림(Lambda & Stream)

## Optional<T>
> T타입 객체의 래퍼클래스, 모든 타입의 객체 저장 가능
```
public final class Optional<T> {
	privata final T value; // T타입의 참조 변수
	...
}
``

### Optional<T> 객체 생성하기
```
String str = "abc";
Optional<String> optVal = Optional.of(str);
Optional<String> optVal = Optional.of("abc");
Optional<String> optVal = Optional.of(null);	// NullPointException 발생
Optional<String> optVal = Optional.ofNullable(null);	//OK

```

+ null 대신 빈 Optional<T>객체를 사용하자
```
Optional<String> optVal = null; // null로 초기화, 바람직하지 않음
Optional<Stirng> optVal = Optional.<String>empty();
```

### Optional<T>객체의 값 가져오기
+ get(), orElse(), orElseGet(), orElseThrow()

get() : null이면 예외발생
orElse() : null일 때, 값을 반환
orElseGet() : 람다식 사용가능
orElseThrow() : null이면 예외발생

+ isPresent() : null이면 false, 아니면 true, null이 아닐때만 작업 수행.

### OptionalInt, OptionalLong, OptionalDouble
> 기본형 값을 감싸는 래퍼클래스, 더 높은 성능이 필요할 때 사용함.

```
public final class OptionalInt {
	...
	private final boolean isPresent; //값이 저장되어 있으면 true
	private final int value; // int타입의 변수
	...
}
```

# *Reference
+ [자바의 정석]
