# Map Collection framework
> Map 컬렉션은 키와 값으로 구성되어 있다. 키와 값은 모두 객체이고 키는 중복 저장될 수 없으며, 만약 키가 중복된다면 기존 값이 사라지고 새로운 값으로 대체된다. 키가 다르면 값이 같더라도 저장이 가능하다.

Map 컬렉션의 종류로는 HashMap, Hashtable, LinkedHashMap, Properties, TreeMap 등이 있다.

# Map 컬렉션 특징
+ Map 인터페이스는 제네릭 타입이다.
+ 객체 추가는 put(), 키가 있는 값을 리턴하는 get(), 객체 삭제 remove()가 있다.
+ 저장된 전체 객체를 얻고 싶을 경우 keySet()과 entrySet()을 이용하는 방법이 있다.

# *Reference
+ [이것이 자바다](http://www.yes24.com/Product/Goods/15651484)
