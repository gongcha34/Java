# 컬렉션 프레임웍(Collection Framework)
> 데이터 그룹을, 프레임웍은 표준화된 프로그래밍 방식이다.

## 1. 컬렉션 프레임웍의 핵심 인터페이스
> 각 컬렉션을 다루는데 필요한 기능을 가진 3개의 인터페이스를 정의하였다.

+ List: 순서가 있는 데이터의 집합, 데이터의 중복을 허용한다.
    + 구현클래스: ArrayList, LinkedList, Stack, Vector
+ Set: 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.
    + 구현클래스: HashSet, TreeSet 등
+ Map: 키와 값의 쌍으로 이루어진 데이터의 집합. 순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다.
    + 구현클래스: HashMap, TreeMap, Hashtable, Properties 등
    + Map.Entry인터페이스
        + Map 인터페이스의 내부 인터페이스이다
        + Map 인터페이스를 구현하는 클래스에서는 Map.Entry 인터페이스도 함께 구현해야한다.
        
### ArrayList
> 컬렉션 프레임웍에서 가장 많이 사용되는 컬렉션 클래스이다.

<pre>
    <code>
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list1, list2);

        list2.add(3,"AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기도 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2)L " + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i = list2.size()-1; i >= 0; i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1, list2);
    </code>
</pre>

### LinkedList
> 배열은 데이터를 읽어오는데 걸리는 시간이 가장 빠르다는 장점이 가지고 있지만 크기를 변경할 수 없고, 비순차적인 데이터의 추가 또는 사제에 시간이 많이 걸린다.
> 이러한 배열의 단점을 보완하기 위해서 링크드 리스트라는 잘구조가 고안되었다.

<pre>
    <code>
        public static void main(String[] args) {
            ArrayList a1 = new ArrayList(1000000);
            LinkedList l1 = new LinkedList();
            add(a1);
            add(l1);
    
            System.out.println("= 접근시간테스트 =");
            System.out.println("ArrayList: " + access(a1));
            System.out.println("LinkedList: " + access(l1));
    
        }
    
        public static void add(List list){
            for(int i=0; i<100000;i++){
                list.add(i+"");
            }
        }
    
        public static long access(List list){
            long start = System.currentTimeMillis();
            for(int i = 0; i < 10000; i++){
                list.get(i);
            }
            long end = System.currentTimeMillis();
            return end - start;
        }
    </code>
</pre>
 
ArrayList: 읽기(빠르다), 추가/삭제(느리다), 비고: 순차적인 추가삭제는 더 빠름, 비효울적인 메모리 사용
LinkedList: 읽기(느리다), 추가/삭제(빠르다), 비고: 데이터가 많을수록 접근성이 떨어짐.

# *Reference
+ [자바의 정석]