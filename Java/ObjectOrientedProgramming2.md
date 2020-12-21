# 객체지향 프로그래밍 2
## 1. 상속(Inheritance)
> 상속이란, 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다. 

### 상속 정의와 장점
1. 적은 양의 코드로 새로운 클래스를 작성할 수 있고, 코드를 공통적으로 관리하기 때문에 코드의 추가 및 변경이 매우 용이하다.
2. 코드의 재사용성을 높이고 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여한다.

자바에서 상속을 구현하는 방법
<pre>
	<code>
		class Child extends Parent {
			// 상속해주는 클래스를 조상클래스, 상속 받는 클래스를 자손 클래스라한다.
		}
	</code>
</pre>

+ 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다.
+ 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
+ 전체 프로그램을 구성하는 클래스들을 면밀히 설계 분석하여, 클래스간의 상속관계를 적절히 맺어 주는 것이 객체지향 프로그래밍에서 가장 중요한 부분이다.
+ 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성된다.

### 클래스간의 관계 - 포함관계
> 상속이외에도 클래스를 재사용하는 또 다른 방법이 있는데, 그게 바로 클래스간에 '포함'관계이다.
> 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언한다.

### 클래스간의 관계 결정하기
상속관계: ...은 ~이다(is-a)
포함관계: ...은 ~을 가지고 있다(has-a)

### 단일 상속
> 자바에서는 오직 단일 상속만을 허용한다. 둘 이상의 클래스로부터 상속을 받을 수 없다.

### Object클래스 - 모든 클래스의 조상
> Object클래스는 모든 클래스 상속게층도의 최상위에 잇는 조사클래스이다. 모든 클래스들은 자동적으로 Object클래스로부터 상속받는다.

자바의 모든 클래스들은 Object클래스의 멤버들을 상속 받기 때문에 Object클래스에 정의된 멤버들을 사용할 수 있다.

## 2. 오버라이딩(overriding)
> 상속받은 메서드를 그대로 사용하기도 하지만, 자손 클래스 자신에 맞게 변경해야하는 경우가 많다. 이럴 때 조상의 메서드를 오버라이딩한다.

### 오버라이딩의 조건
자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와
- 이름이 같아야 한다.
- 매개변수가 같아야 한다.
- 반환타입이 같아야 한다.
다만 접근 제어자와 예외는 제한된 조건 하에서만 다르게 변경할 수 있다.

1. 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 없다.
	접근 제어자의 접근범위를 나열하면 public>protected>(default)>private이다
2. 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.

### 오버로딩 vs. 오버라이딩
오버로딩 :  기존에 없는 새로운 메서드를 정의하는 것 (new)
오버라이딩 : 상속받은 메서드의 내용을 변경하는 것(change, modify)

### super
> super는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
> 멤버변수와 지역변수의 이름이 같을 때 this를 붙여서 구별했듯이 상속받은 멤버와 자신의 멤버와 이름이 같을 때는 super를 붙여서 구별한다.

+ 조상 클래스의 멤버와 자손 클래스의 멤버가 중복 정의되어 서로 구별해야하는 경우에만 쓰는게 좋다.
+ static 메서드는 인스턴스와 관련이 없다. 그래서 this와 마찬가지로 super역시 static메서드에서는 사용할 수 없고 인스턴스메서드에서만 사용할 수 있다.

### super() - 조상 클래스의 생성자
> this()와 마찬가지로 super() 역시 생성자이다. this()는 같은 클래스의 다른 생성자를 호출하는 데 사용되지만, super()는 조상 클래스의 생서자를 호출하는데 사용된다.

Object클래스를 제외한 모든 클래스의 생성자 첫 줄에 생성자,this() 또는 super(),를 호출해야 한다. 그렇지 않으면 컴파일러가 자동적으로 super();를 생성자의 첫줄에 삽입한다.

1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
2. 생성자 - 선택한 클래스의 어떤 생성자를 이용해서 인스턴스를 생성할 것인가?

## 3. package와 import
### 패키지(package)
> 패키지란, 클래스의 묶음이다.
> 패키지에는 클래스 또는 인터페이스를 포함시킬 수 있으며, 서로 관련된 클래스들끼리 그룹 다누이로 묶어 놓음으로써 클래스를 효율적으로 관리할 수 있다.

+ 같은 이름의 클래스 일지라도 서로 다른 패키지에 존재하는 것이 가능하다.
+ 클래스의 실제 이름(full name)은 패키지명을 포함한 것이가
+ 클래스가 물리적으로 하나의 클래스파이(.class)인 것과 같이 패키지는 물리적으로 하나의 디렉토리이다.

- 하나의 소스파일에는 첫 번째 무장으로 단 한 번의 패키지 선언만을 허용한다.
- 모든 클래스는 반드시 하나의 패키지에 속해야 한다.
- 패키지는 점(.0을 구분자로 하여 계층구조로 구성할 수 있다.
- 패키지는 물리적으로 클래스 파일(.class)을 포함하는 하나의 디렉토리이다.

### 패키지의 선언
> 하나의 소스파일에 단 한번만 선언될 수 있다.

<pre>
	<code>
		package 패키지명;
	</code>
</pre>

### import문
> 다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다.
> 하지만, 매법 패키지명을 붙여서 작성하기는 불편하기 때문에 클래스의 코드를 작성하기 전에 import문으로 사용하고자 하는 클래스의 패키지를 미리 명시해주면 패키지명은 생략할 수 있다.

일반적인 소스파일(*.java)의 구성은 다음의 순서로 되어 있다.
1. package문
2. import문
3. 클래스 선언

### static import문
> static 멤버를 호출할 때 클래스 이름을 생략할 수 있다.

## 4. 제어자
### 제어자란?
> 제어자는 클래스, 변수 또는 메서드의 선언부와 함께 사용되어 부가적인 의미를 부여한다. 제어자의 종류는 크게 접근 제어자와 그 외의 제어자로 나눌 수 있다.

접근 제어자: public, protected, default, private
그 외: static, final, abstract, native, transient, synchronized, volatile, strictfp

하나의 대상에 대해서 여러 제어자를 조합하여 사용하는 것이 가능하다.
단, 접근 제어자는 한 번에 네 가지 중 하나만 선택해서 사용할 수 있다.

### static -클래스의, 공통적인
> 하나의 변수를 모든 인스턴스가 공유하기 때문에 클래스 변수는 인스턴스에 관계없이 같은 값을 갖는다.
> static이 붙은 멤버 변수와 메서드, 초기화 블럭은 인스턴스가 아닌 클래스에 관계된 것이기 때문에 인스턴스를 생성하지 않고도 사용할 수 있다.

사용될 수 있는 곳: 멤버변수, 메서드, 초기화 블럭

### final - 마지막의, 변경될 수 없는
> 변수에 사용되면 값을 변경할 수 없는 상수가 되며, 메서드에 사용되면 오버라이딩을 할 수 없게 되고, 클래스에 사용되면 자신의 확장하는 자손클래스를 정의하지 못하게 된다.

사용될 수 있는 곳: 클래스, 메서드, 메버변수, 지역변수

#### 생성자를 이용한 final멤버 변수의 초기화
> final이 붙은 변수는 상수이므로 일반적으로 선언과 초기화를 동시에 하지만, 인스턴스변수의 경우 생성자에서 초기화 되도록 할 수 있다.

### abstract - 추상의, 미완성의
> 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상 메서드를 선언하는데 사용된다.
> 클래스에 사용되어 클래스 내에 추상메서드가 존재한다는 것을 쉽게 알 수 있게 한다.

사용될 수 있는 곳: 클래스, 메서드

### 접근 제어자
> 접근 제어자는 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한하는 역할을 한다.

#### 접근 제어자를 이용한 캡슐화
> 클래스나 멤버, 주로 멤버에 접근 제어자를 사용하는 이유는 클래스의 내부에 선언된 데이터를 보호하기 위해서이다.
> 클래스 내에서만 사용되는, 내부 작업을 위해 임시로 사용되는 멤버변수나 부분작업을 처리하기 위한 메서드 등의 멤버들을 클래스 내부에 감추기 위해서다.

#### 생성자의 접근 제어자
> 생성자에 접근 제어자를 사용함으로써 인스턴스의 생성을 제한할 수 있다.

생성자의 접근 제어자를 private으로 지정하면, 외부에서 생성자에 접근할 수 없으므로 인스턴스를 생성할 수 없게 된다.
그래도 클래스 내부에서는 인스턴스를 생성할 수 있다.
대신 인스턴스를 생성해서 반환해주는 public 메서드를 제공함으로써 외부에서 이 클래스의 인스턴스를 사용하도록 할 수 있다.


## 5. 다형성
### 다형성이란?
> 객체지향개념에서 다형성이란 '여러 가지 형태를 가질 수 있는 능력'을 의미하며, 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써 다형성을 프로그램적으로 구현하였다.
> 조상 클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하였다.

서로 상속관계에 있을 경우, 다음과 같이 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조하도록 하는 것도 가능하다.
<pre>
	<code>
		Tv t = new CaptionTv(); // 조상 타입의 참조변수로 자손 인스턴스를 참조
	</code>
</pre>

인스턴스를 같은 타입의 참조변수로 참조하는 것과 조상타입의 참조변수로 참조하는 것은 어떤 차이가 있는지 알아보자.

<pre>
	<code>
		CaptionTv c = new CaptionTv();
		Tv t = new CaptionTv();
	</code>
</pre>

이 경우 실제 인스턴스가 CaptionTv타입이라 할지라도, 참조변수 t로는 CaptionTv인스턴스의 모든멤버를 사용할 수 없다.
Tv타입의 참조변수로는 CaptionTv인스턴스 중에서 Tv클래스의 멤버들(상속받은 멤버포함)만 사용할 수 있다.
+ 둘 다 같은 타입의 인스턴스지만 참조변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다.
+ 자손타입의 참조변수로 조상타입의 인스턴스를 참조하는 것은 불가능하다.
	+ 참조변수가 사용할 수 있는 멤버의 개수는 인스턴스의 멤버 개수보다 같거나 적어야 한다.

### 참조변수의 형변환
> 기본형 변수와 같이 참조변수도 형변환이 가능하다. 단, 서로 상속관계에 있는 클래스사이에서만 가능하기 때문에 자손타입의 참조변수를 조상타입의 참조변수로, 조상타입의 참조변수를 자손타입의 참조변수로 형변환만 가능하다.

자손타입 -> 조상타입 : 형변환 생략가능
자손타입 <- 조상타입 : 형변환 생략불가

자손타입으로의 형변환은 생략할 수 없으며, 형변화을 수행하기 전에 instanceof 연산자를 사용해서 참조변수가  참조하고 있는 실제 인스턴스의 타입을 확인하는 것이 안전하다.

형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 때문에 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
단지 참조변수의 형변환을 통해서, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위(개수)를 조절하는 것뿐이다.

<pre>
	<code>
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine) car;
		fe.drive();
		car2.drive();
	</code>
</pre>

'fe = (FireEngine) car'에서 에러가 발생한다.
이유는 참조변수 car가 참조하고 있는 인스턴스가 Car타입의 인스턴스이기 때문이다.
(자손타입의 참조변수로 조상타입의 인스턴스를 참조하는 것은 불가능하다. 참고)

서로 상속관계에 잇는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있으나, 참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용되지 않는다.
그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인하는 것이 중요하다.

### instanceof 연산자
> 주로 조건문에 사용되며, instanceof의 왼쪽에는 참조변수를 오른쪽에는 타입(클래스명)이 피연산자로 위치한다. 그리고 연산의 결과로 boolean값 하나를 반환한다

어떤 타입에 대한 instanceof연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.

### 참조변수와 인스턴스의 연결
> 메서드의 경우 조상클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우에도 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출되지만, 멤버변수의 경우 참조변수의 타입에 따라 달라진다.
<pre>
	<code>
		public class BindingTest {
		public static void main(String[] args) {
			Parent p = new Child();
			Child c =  new Child();
			
			System.out.println("p.x= " + p.x);
			p.method();
			System.out.println("c.x= " + c.x);
			c.method();
			}
		}
	
		class Parent {
			int x = 100;
			
			void method() {
				System.out.println("부모 메서드");
			}
		}
		
		class Child extends Parent {
			int x = 200;
			void method() {
				System.out.println("자식 메서드");
			}
		}
	</code>
</pre>

결과값은 아래와 같이 나온다.
p.x= 100
자식 메서드
c.x= 200
자식 메서드

### 매개변수의 다형성
> 참조변수의 다형적인 특징은 메서드의 매개변수에도 적용된다.

매개변수에 조상타입 매개변수를 넣음으로써 자손타입의 참조변수면 어느 것이나 매개변수로 받아들일 수 있다.

### 여러 종류의 객체를 배열로 다루기
> 조상타입의 참조변수 배열을 사용하면, 공통의 조상을 가진 서로 다른 종류의 객체를 배열로 묶어서 다룰 수 있다. 또는 묶어서 다루고 싶은 객체들의 상속관계를 따져서 가장 가까운 공통조상 클래스 타입의 참조변수 배열을 생성해서 객체에 저장하면 된다.

## 6. 추상클래스
### 추상클래스란?
> 미완성 설계도에 비유할 수 있다. 클래스가 미완성이라는 것은 멤버의 갯수에 관계된 것이 아니라, 단지 미완성 메서드(추상 메서드)를 포함하고 있다는 의미이다.

+  추상클래스로 인스턴스를 생성할 수 없다.
+ 추상클래스는 상속을 통해서 자손클래스에 의해서만 완성될 수 있다.

추상클래스는 키워드 ‘abstract’를 붙이기만 하면 된다.
<pre><code>
	abstract class 클래스이름 {
		//...
}
</code></pre>

추상클래스는 추상메서드를 포함하고 있다는 것을 제외하고는 일반클래스와 전혀 다르지 않다. 추상클래스에도 생성자가 있으며,멤버변수와 메서드도가질수 있다.

### 추상 메서드
> 메서드는 선언부와 구현부(몸통)으로 구성되어 있다고 했다. 선언부만 작성하고 구현부는 작성하지 않은 채로 남겨 둔 것이 추상메서드이다.

주석을 통해 어떤 기능을 수행할 목적으로 작성하였는지 설명한다.
abstract 리턴타입 메서드이름();

## 인터페이스(interface)
### 인터페이스란?
> 인터페이스는 일종의 추상 클래스이다. 인터페이스는 추상클래스처럼 추상메서드를 갖지만 추상클래스보다 추상화 정도가 높아서 추상클래스와 달리 몸통을 갖춘 일반메서드 또는 멤버변수를 구성원으로 가질 수 없다.
>오직 추상메서드와 상수만을 멤버로 가질 수 있으며, 그 외의 다른 어떠한 요소도 허용하지 않는다.

### 인터페이스의 작성
> 키워드로 class 대신 interface를 사용한다.
> 접근 제어자로 public과 default를 사용할 수 있다.

<pre><code>
	interface 인터페이스이름 {
		public static final 타입 상수이름 = 값;
		public abstract 메서드이름(매개변수목록);
}
</code></pre>
인퍼테이스의 멤버들은 다음과 같은 제약사항들이 있다.
모든 멤버변수는 public static final이어야 하며, 이를 생략할 수 있다.
모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.
단, static메서드와 디폴트 메서드는 예외

### 인터페이스의 상속
> 인터페이스는 인터페이스로부터만 상속을 받을 수 있으며, 클래스와 달리 다중상속, 즉 여러 개의 인터페이스로부터 상속을 받는 것이 가능하다.

### 인터페이스의 구현
> 인터페이스도 추상클래스처럼 그 자체로는 인스턴스를 생성할 수 없으며, 인터페이스도 자신에 정의된 추상메서드의 몸통을 만들어주는 클래스를 작성해야 한다.

키워드는 ‘implements’를 사용한다.
+ 만일 인터페이스의 메서드 중 일부만 구현한다면, abstract를 붙여서 추상클래스로 선언해야 한다.
+ 상속(extends)과 구현(implements)을 동시에 할 수 있다.

### 인터페이스를 이용한 다중상속
> 만일 두 개의 클래스로부터 상속을 받아야 할 상황이라면, 두 조상클래스 중에서 비중이 높은 쪽을 선택하고 다른 한쪽은 클래스 내부에 멤버로 포함시키는 방식으로 처리하거나 어느 한쪽의 필요한 부분을 뽑아서 인터페이스로 만든 다음 구현하도록 한다.

### 인터페이스를 이용한 다형성
> 해당 인터페이스 타입의 참조변수로 이를 구현한 클래스의 인스턴스를 참조할 수 있으며, 인터페이스 타입으로 형변환도 가능하다.

메서드의 리턴타입으로 인터페이스의 타입을 지정하는 것이 가능하다.
★리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다.

### 인터페이스의 장점

개발 시간을 단축할 수 있다.
표준화가 가능하다
서로 관계없는 클래스들에게 관계를 맺어줄 수 있다
독립적인 프로그래밍이 가능하다.

### 인터페이스의 이해
클래스를 사용하는 쪽(user)과 클래스를 제공하는 쪽(provider)이 있다.
메서드를 사용(호출)하는 쪽(user)에서는 사용하려는 메서드(provider)의 선언부만 알면 된다. (내용을 몰라도 된다.)

# *Reference
+ [Java의 정석](http://www.yes24.com/Product/Goods/24259565?OzSrank=1)






