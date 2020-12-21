# Lamda
> 람다식이란 "익명 함수를 생성하기 위한 식"이다.  컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 집계할 수 있다. 람다식의 형태는 매개 변수를 가진 코드 블록이지만, 런타임 시에는 익명 구현 객체를 생성한다.

# 사용법
+ 함수형 인터페이스는 익명함수이기 때문에 매소드를 두개이상 선언할 수 없다.

전통적인 방식으로 만들면 처음에 @FunctionalInterface 인터페이스를 만들고 인터페이스를 상속하는 하위클래스를 만든후 오버라이딩으로 메서드를 구현해야한다.
그리고 메인에 인스턴스를 생성후 오버라이딩한 메서드를 불러와서 사용하는 방식이다.

반면 람다식은 @FunctionalInterface 인터페이스를 만들고 바로 메인으로 넘어와 익명함수 구현후 값을 넣으면 끝이다!
코드는 다음과 같다

<pre>
<code>
	//인터페이스클래스명 + 매개변수명 + return값
	LamdaInterface lamda = (s, v) -> System.out.println(s + ", " + v);
	lamda.makeString("Hello", "World");
</code>
</pre>

# *Reference
+ [이것이 자바다](http://www.yes24.com/Product/Goods/15651484)