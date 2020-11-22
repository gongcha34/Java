# Lamda
> 람다식이란 "익명 함수를 생성하기 위한 식"이다.  컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 집계할 수 있습니다. 람다식의 형태는 매개 변수를 가진 코드 블록이지만, 런타임 시에는 익명 구현 객체를 생성합니다.

# 사용법
+ 함수형 인터페이스는 익명함수이기 때문에 매소드를 두개이상 선언할 수 없다.

<pre>
<code>
		//인터페이스클래스명 + 매개변수명 + return값
		MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMaxNumber(10, 20));
</code>
</pre>


# *Reference
+ [이것이 자바다](http://www.yes24.com/Product/Goods/15651484)