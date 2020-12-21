# 1. 지네릭스(Generics)
## 지네릭스란?
> 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 해주는 기능이다.
> 제네릭스를 통해 타입 안정성을 제공한다. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.

클래스를 만들 때 데이터 타입별로 만들어야 하는 단점이 있다. 이럴경우 Object 클래스로 만들면 해결되지만 데이터 타입을 보장하지 않는다는 단점이 있다.
이때 제네릭 클래스를 적용하면 데이터 타입을 보장하며 문제를 해결할 수 있다!

<pre>
	<code>
		class Box<T> {	//지네릭 타입 T를 선언
			T item;
			
			void setItem(T item){ this.item = item; }
			T getItem() {return item;}
		}
	</code>
</pre>
Box<T>에서 T를 '타입 변수(type variable)'라고 하며 'Type'의 첫글자에서 따온 것인다, ArrayList<E>의 경우, 타입 변수 E는 'Element(요소)'의 첫 글자를 따서 사용했다.
	
## 지네릭 타입과 다형성
+ 참조 변수와 생성자의 대입된 타입은 일치해야 한다.

<pre>
	<code>
		// ArrayList<Tv> list = new ArrayList<Tv>();
		// ArrayList<Product> list = new ArrayList<Tv>(); // 에러!
	</code>
</pre>

+ 지네릭 클래스간의 다형성은 성립 (여전히 대입된 타입은 일치해야 함)
<pre>
	<code>
		// List<Tv> = new ArrayList<Tv>();
		// List<Tv> = new LinkedList<Tv>();
	</code>
</pre>
+ 매개변수의 다형성도 성립.
<pre>
	<code>
		// ArrayList<Product> list = new ArrayList<Product>();
		// list.add(new Product());
		// list.add(new Tv());
		// list.add(new Audio());
	</code>
</pre>
	
## 실습 

<pre>
	<code>
		class Fruit {public String toString() {return "Fruit";}}
		class Apple extends Fruit {public String toString() {return "Apple";}}
		class Grape extends Fruit {public String toString() {return "Grape";}}
		class Toy {public String toString() {return "Toy";}}
		
		public class FruitBoxEx1 {
			public static void main(String[] args) {
				Box<Fruit> fruitBox = new Box<Fruit>();
				Box<Apple> appleBox = new Box<Apple>();
				Box<Toy> toyBox = new Box<Toy>();
				// Box<Grape> grapeBox = new Box<Apple>(); // 에러, 타입 불일치
				
				fruitBox.add(new Fruit());
				fruitBox.add(new Apple()); // OK. void add(Fruit item) { list.add(item); }
				
				appleBox.add(new Apple());
				appleBox.add(new Apple());
				// appleBox.add(new Toy()); // 에러, Box(Apple)에는 Apple만 담을 수 있음.
				
				toyBox.add(new Toy());
				// toyBox.add(new Apple()); // 에러, Box(Toy)에는 Apple을 담을 수 없음
				
				System.out.println(fruitBox);
				System.out.println(appleBox);
				
			}
		}
		
		
		class Box<T> {
			ArrayList<T> list = new ArrayList<T>();
			void add(T item) { list.add(item); }
			T get(int i) { return list.get(i); }
			public String toString() { return list.toString(); }
		}
	</code>
</pre>

## 제한된 지네릭 클래스
+ 지네릭 타입에 'extends'를 사용하면, 특정 타입의 자손들만 대입할 수 있게 제한할 수 있다.
+ 한 클래스의 자손들만 담을 수 있다는 제한이 더 추가된 것이다.
+ 만일 클래스가 아니라 인터페이스를 구현해야 한다는 제약이 필요하다면, 이때도 'extends'를 사용한다. 'implements'를 사용하지 않는 다는 점에 주의하자.
+ 클래스의 자손이면서 인터페이스도 구현해야한다면 '&'기호로 연결한다.

## 와일드 카드
> 지네릭 타입이 달른 것만으로는 옵버로딩이 성립하지 않는다.
> 와일드 카드는 기호 '?'로 표현하며 어떠한 타입도 될 수 있다.
> '?'만으로는 Object타입과 다를 게 없으므로, 다음과 같이 'extends'와 'super'로 상한과 하한을 제한할 수 있다.

<pre>
	<code>
		class Fruit {public String toString() {return "Fruit";}}
		class Apple extends Fruit {public String toString() {return "Apple";}}
		class Grape extends Fruit {public String toString() {return "Grape";}}

		class Juice {
			String name;

			Juice(String name){
				this.name = name + "Juice";
			}

			public String toString() {return name;}
		}

		class Juicer {
			static Juice makeJuice(FruitBox<? extends Fruit> box) {

				String tmp = "";

				for(Fruit f : box.getList())
					tmp += f + " ";

				return new Juice(tmp);
			}
		}

		public class FruitBoxEx3 {
			public static void main(String[] args) {
				FruitBox<Fruit> fruitbox = new FruitBox<>();
				FruitBox<Apple> applebox = new FruitBox<>();

				fruitbox.add(new Fruit());
				fruitbox.add(new Apple());
				fruitbox.add(new Grape());
				applebox.add(new Apple());
				applebox.add(new Apple());
				System.out.println(Juicer.makeJuice(fruitbox));
				System.out.println(Juicer.makeJuice(applebox));
			}
		}

		class FruitBox<T extends Fruit> extends Box<T> {}

		class Box<T> {

			ArrayList<T> list = new ArrayList<T>();
			void add(T item) { list.add(item); }
			T get(int i) { return list.get(i); }
			ArrayList<T> getList() { return list; }
			int size() { return list.size(); }
			public String toString() { return list.toString(); }

		}
	</code>
</pre>

## 지네릭 메서드와 와일드 카드
> 와일드 카드는 하나의 참조 변수로 서로 다른 타입이 대입된 여러 지네릭 객체를 다루기 위한 것이고, 지네릭 메서드는 메서드를 호출할 때마다 다른 지네릭 타입을 대입할 수 있게 한 것.

# 2. 열거형
> 서로 관련된 상수를 편리하게 선언하기 위한 것으로 여러 상수를 정의할 때 사용하면 유용하다.

자바의 열거형은 값뿐만 아니라 타입까지 체크하기 때문에 타입에 안전하다고 할 수 있다.
<pre>
	<code>
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+ d1);
		System.out.println("d2="+ d2);
		System.out.println("d3="+ d3);

		System.out.println("d1==d2 ? " + (d1==d2));
		System.out.println("d1==d3 ? " + (d1==d3));
		System.out.println("d1.equals(d3) ?" + d1.equals(d3));
		// System.out.println("d2 > d3 ? " + (d2 > d3));  // 에러
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
		
		switch(d1) {
			case EAST: // Direction.EAST라고 쓸 수 없다.
				System.out.println("The direction is EAST.");
				break;
			case SOUTH: // Direction.SOUTH라고 쓸 수 없다.
				System.out.println("The direction is SOUTH.");
				break;
			case WEST: // Direction.WEST라고 쓸 수 없다.
				System.out.println("The direction is WEST.");
				break;
			case NORTH: // Direction.NORTH라고 쓸 수 없다.
				System.out.println("The direction is NORTH.");
				break;
			default :
				System.out.println("Invalid direction");
				break;
		}
		
		Direction[] dArr = Direction.values();
		for (Direction d : dArr) {
			System.out.printf("%s=%s%n",d.name(), d.ordinal());
		}
	</code>
</pre>


# *Reference
+ [이것이자바다]

