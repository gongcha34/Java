# 객체지향 프로그래밍
> 객체지향이론의 기본 개념은 '세계는 사물로 구성되어 있고, 발생하는 모든 사건들은 사물들의 상호작용이다'라고 한다. 
객체지향언어는 기존의 프로그래밍 언어에서 규칙을 추가해 보다 발전된 형태이며 객체 지향 언어의 주요특징은 아래와 같다.

+ 코드의 재사용성이 높다
+ 코드의 관리가 용이하다
+ 신뢰성이 높은 프로그래밍이 가능하다.

# 클래스와 객체
> 클래스는 '객체를 정의, 생성'하는 역할을 한다. 클래스는 객체의 설계도이다.

# 객체와 인스턴스
> 클래스로부터 만들어진 객체를 인스턴스라고 한다.

인스턴스는 객체와 같은 의미이지만 객체는 인스턴스들을 대표하는 포괄적인 의미를 갖고있고, 
인스턴스는 구체적인 클래스로부터 만들어진 객체를 강조하는 의미를 갖고 있다.

# 객체
> 객체의 구성요소는 속성(멤버변수)과 기능(메서드)이며 멤버라고 부른다.

# 인스턴스의 생성과 사용
<pre>
<code> 
  Tv t;           // Tv클래스 타입의 참조변수 선언
  t = new Tv();   // Tv 인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
</code>
</pre>

# 클래스 메서드(static메서드)와 인스턴스 메서드
> 클래스 메서드는 객체를 생성하지 않아도 '클래스이름.메서드이름(매개변수)'식으로 호출이 가능하다 , 반면에 인스턴스 메서드는 인스턴스를 생성해야만 호출할 수 있다.

+ 클래스 생성시 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것은 static을 붙인다.
+ 클래스 변수는 인스턴스를 사용하지 않아도 된다.
+ 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
+ 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.

<pre>
<code>
class MemberCall{
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    /* static int cv2 = iv;  
    non-static variable iv cannot be referenced from a static context */
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
      System.out.println(cv);
      // System.out.println(iv); 클래스 메서드에 인스턴스 변수 사용 불가
      MemberCall c = new MemberCall();
      System.out.println(c.iv);
    }

    void instanceMethod1() {
      System.out.println(cv);
      System.out.println(iv);
    }

    static void staticMethod2() {
      staticMethod1();
      // instanceMethod1(); 클래스메서드에 인스턴스메서드 호출 불가
      MemberCall c = new MemberCall();
      c.instanceMethod1();
    }

    void instanceMethod2() {
      staticMethod1();
      instanceMethod1();
    }

}
</code>
</pre>

# 오버로딩
> 자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 매개변수의 개수와 타입이 다르면 같은 이름을 사용해서 메서드를 정의할 수 있다

오버로딩 조건
1. 메서드는 이름이 같아야 한다.
2. 매개변수 개수 또는 타입이 달라야 한다.

(주의) 반환타입은 오버로딩에 영향을 주지 않는다.

오버로딩의 장점은 이름 짓기가 쉽고 기억하기 편리하며, 오류 가능성을 줄일 수 있다.

# 가변인자 (Variable arguments)
> 매개 변수의 개수를 동적으로 지정할 수 있다.

(주의) 
1. 가변인자는 제일 마지막에 선언되어야 한다.
2. 오버로딩된 메서드가 구분이 안될 경우 컴파일에러가 발생한다. (가변인자를 사용한 메서드는 오버로딩하지 않는 것이 좋다.)

# *Reference
+ [Java의 정석](http://www.yes24.com/Product/Goods/24259565?OzSrank=1)
