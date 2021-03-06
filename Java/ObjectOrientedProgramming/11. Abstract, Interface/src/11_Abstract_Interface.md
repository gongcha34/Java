# 추상클래스와 인터페이스
> 추상클래스와 인터페이스를 알아 보자!

# 추상클래스란?
> 추상메서드를 포함하는 클래스, 일반 변수나 일반 메서드를 같이 사용할 수 있다. 

# 추상 클래스의 특징
+ abstract를 사용한다.
+ 인스턴스 생성이 안된다.
+ 서브클래스에서 추상 메서드를 재정의하지 않으면 해당 클래스도 추상 클래스가 된다.

# 추상 클래스의 사용법
<pre>
<code>
	//추상 클래스
	abstract class 클래스명 {
		//추상메소드
		public abstract void 메소드명();
	}
</code>
</pre>

# 인터페이스의란?
> 개발 코드와 객체가 서로 통신하는 접점 역할을 한다.

# 인터페이스의 특징
+ implements 키워드 사용
+ 추상메소드와 상수를 쓴다. 인터페이스에 선언된 추상 메소드는 모두 public abstract의 특성을 갖기 때문에 자동 생략이 가능하다 (상수 역시 static final 생략 가능)
+ 인터페이스 다중 상속이 가능하다.


# 인터페이스 사용법
<pre>
<code>
	//인퍼페이스
	interface 인터페이스명 {
		//추상 메소드
		타입 메서드명(매개변수,…);
	}
</code>
</pre>

# [연습 코드](https://github.com/gongcha34/TIL/tree/master/11.%20Abstract%2C%20Interface/src)
