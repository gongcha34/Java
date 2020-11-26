# Collection framework
> 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합

데이터를 저장하는 자료 구조에 따라 다음과 같이 나눠진다.

1. List 인터페이스
2. Set 인터페이스
3. Map 인터페이스

멤버 클래스는 클래스나 객체가 사용 중이라면 재사용이 가능하지만, 로컬 클래스는 메소드 실행 시에만 사용되고, 메소드가 끝나면 종료되서 없어진다.

# List<E>
> 순서가 있고 데이터의 중복을 허용함.

# Set<E>
> 순서가 없는 데이터의 집합으로, 데이터의 중복을 허용하지 않음.

# Map<E>
> 

# 컬렉션 클래스
> 컬렉션 프레임워크에 속하는 인터페이스를 구현한 클래스

<pre>
<code>
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
</code>
</pre>

# 컬렉션 인터페이스
+ boolean add(E e) : 주어진 객체를 맨 끝에 추가
+ boolean remove(Object o) : 저장된 객체를 삭제
+ int size() : 총 개수를 반환함.
+ Iterator<E> iterator() : Set, List, 그리고 Map 의 element 들을 순차접근할 수 있으며, 단방향 traverse 만 지원한다.
	+ hasNext()
	+ next()
	+ remove()
+ ListIterator : List type에서만 사용이 가능하다. ListIterator는 상위계층의 Iterator를 상속하며 좀 더 다양한 기능을 제공한다.
	+ add()
	+ hasNext()
	+ next()
	+ hasPrevious()
	+ previous()
	+ remove()
	+ nextIndex()
	+ previousIndex() 

# *Reference
+ [이것이 자바다](http://www.yes24.com/Product/Goods/15651484)
+ [돼지왕 놀이터](https://aroundck.tistory.com/822)
